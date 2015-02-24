package Project_Euler;

/**
 * @author Suheng
 *
 */
public class Problem_27 {
	public static void main(String[] args) {
		int max = -1;
		int[] ab = { 0, 0 };
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 1000; j++) {
				int count = quadratic(i, j);
				if (count > max) {
					max = count;
					ab[0] = i;
					ab[1] = j;
				}
			}
		}
		for (int i = 0; i > -1000; i--) {
			for (int j = 0; j < 1000; j++) {
				int count = quadratic(i, j);
				if (count > max) {
					max = count;
					ab[0] = i;
					ab[1] = j;
				}
			}

		}

		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j > -1000; j--) {
				int count = quadratic(i, j);
				if (count > max) {
					max = count;
					ab[0] = i;
					ab[1] = j;
				}
			}

		}

		for (int i = 0; i > -1000; i--) {
			for (int j = 0; j > -1000; j--) {
				int count = quadratic(i, j);
				if (count > max) {
					max = count;
					ab[0] = i;
					ab[1] = j;
				}
			}

		}

		System.out.println(ab[0] + " : " + ab[1]);
		System.out.println(max - 1);
		System.out.println(ab[0] * ab[1]);
	}

	private static int quadratic(int a, int b) {
		int count = 0;
		int n = 0;
		while (true) {
			int temp = n * n + a * n + b;
			if (temp <= 0) {
				break;
			}
			// 判断是否为素数
			if (!judge(temp)) {
				break;
			}
			n++;
		}
		return n;
	}

	private static boolean judge(int temp) {
		// TODO Auto-generated method stub

		boolean flag = true;
		for (int i = 2; i * i <= temp; i++) {
			if (temp % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}