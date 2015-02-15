package Project_Euler;

/**
 * @author Suheng
 *
 */
public class Problem_12 {
	public static void main(String[] args) {
		int th = 0;
		int num = 0;
		int result = -1;
		while (true) {
			th++;
			num += th;
			int divNum = divIt(num);
			System.out.println(num + ":" + divNum);
			if (divNum > 500) {
				result = num;
				break;
			}
		}
		System.out.println(result);
	}

	// 根据给定的数字，返回分解后的个数
	private static int divIt(int num) {
		int count = 0;
		for (int i = 1; i * i <= num; i++) {
			if (num % i == 0) {
				count += 2;
			}
		}

		return count;
	}
}
