package Project_Euler;

import java.util.HashSet;

/**
 * @author Suheng
 *
 */
public class Problem_23 {
	public static void main(String[] args) {
		// 用于存放所有的abundant number
		boolean[] abundantNumber = new boolean[28124];
		HashSet<Integer> ht = new HashSet<Integer>();
		for (int i = 1; i <= 28123; i++) {
			if (isAbundant(i)) {
				abundantNumber[i] = true;
			}
		}

		int sum = 0;
		for (int i = 1; i <= 28123; i++) {
			if (!is2ASum(i, abundantNumber)) {
				sum += i;
			}
		}

		System.out.println(sum);
	}

	private static boolean is2ASum(int num, boolean[] abundantNumber) {
		boolean flag = false;

		for (int i = 1; i <=num; i++) {
			if (abundantNumber[i]) {
				int gap = num - i;
				if (abundantNumber[gap]) {
					return true;
				}
			}
		}
		return flag;
	}

	// 判断一个数字是否为abundant number
	private static boolean isAbundant(int number) {
		boolean flag = false;
		int tot = 1;
		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				if (i == number / i) {
					tot += i;
				} else {
					tot += i + number / i;
				}
			}
			if (tot > number) {
				flag = true;
				break;
			}
		}

		return flag;

	}
}
