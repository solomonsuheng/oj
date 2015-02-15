package Project_Euler;

/**
 * @author Suheng
 *
 */
public class Problem_14 {
	public static int MAX = 1000000;

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		boolean[] check = new boolean[MAX];
		long n = MAX;
		int max = 0;
		for (int i = MAX - 1; i > 1; i--) {
			if (check[i]) {
				continue;
			}
			System.out.println(i);
			int temp = getTerm(i, check);
			if (temp > max) {
				max = temp;
				n = i;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time:" + (endTime - startTime) / 1000.0 + "s");
		System.out.println(max);
		System.out.println(n);
	}

	private static int getTerm(int n, boolean[] check) {
		// TODO Auto-generated method stub
		long ntemp = n;
		int count = 0;
		while (true) {
			count++;
			if (ntemp < MAX) {
				check[n] = true;
			}
			if (ntemp % 2 == 0) {
				// 偶数
				ntemp /= 2;
			} else {
				// 奇数
				ntemp = 3 * ntemp + 1;
			}

			if (ntemp == 1) {
				count++;
				break;
			}
		}
		return count;
	}
}
