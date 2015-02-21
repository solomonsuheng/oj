package Project_Euler;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Suheng
 *
 */
public class Problem_21 {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		int tot = 0;
		for (int i = 2; i <= 1000000; i++) {
			int sum = dsum(i);
			if (map.containsKey(sum) && map.get(sum) == i) {
				count++;
				tot += sum + i;
			}
			map.put(i, dsum(i));
		}

		System.out.println(count * 2);
		System.out.println(tot);

	}

	private static int dsum(int num) {
		int sum = 0;
		for (int i = 1; i * i <= num; i++) {
			if (num % i == 0) {
				if (i == 1) {
					sum += 1;
				} else {
					if (i == num / i) {
						sum += i;
					} else {
						sum += i;
						sum += num / i;
					}
				}
			}
		}

		return sum;
	}
}
