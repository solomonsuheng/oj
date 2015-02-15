package Project_Euler;

/**
 * @author Suheng
 *
 */
public class Problem_10 {
	public static int GN = 2000000;

	public static void main(String[] args) {
		boolean[] num = new boolean[GN + 1];
		int i = 2;
		while (i * i <= GN) {
			for (int c = 2, j = c * i; j <= GN; c++, j = i * c) {
				num[j] = true;
			}
			do {
				i++;
			} while (i * i <= GN && num[i] == true);
		}
		long sum = 0;
		for (i = 2; i <= GN; i++) {
			if (num[i] == false) {
				sum += i;
			}
		}

		System.out.println(sum);
	}
}
