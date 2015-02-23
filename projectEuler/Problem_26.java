package Project_Euler;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Suheng
 *
 */
public class Problem_26 {
	public static void main(String[] args) {
		int max = -1;
		int num = -1;
		for (int i = 1; i <= 1000; i++) {
			int len = getIt(i).length();
			if (len > max) {
				max = len;
				num = i;
			}
		}

		System.out.println(num);
	}

	private static String getIt(int nu) {
		StringBuffer result = new StringBuffer();
		int a = 1;
		int b = nu;
		StringBuffer sb = new StringBuffer();
		List<Integer> cycl = new ArrayList<Integer>();
		boolean flag = false;
		while (a != 0) {
			if (a / b == 0) {
				if (sb.length() == 0) {
					sb.append("0.");
				} else {
					sb.append("0");
				}
				cycl.add(a);
				a = a * 10;
			} else {
				sb.append(a / b);
				if (cycl.contains((int) (a % b))) {
					flag = true;
					break;
				}
				cycl.add(a % b);
				a = a % b * 10;
			}
		}
		if (flag) {
			// 是循环数字
			for (int i = 1; i <= cycl.size(); i++) {
				result.append(sb.charAt(sb.length() - i));
			}

		}

		return result.toString();
	}
}
