package Project_Euler;

/**
 * @author Suheng
 *
 */
public class Problem_15 {
	public static void main(String[] args) {
		// (0,0) to point (a,b) is the proble of the binomial
		int pointA = 20;
		int pointB = 20;

		System.out.println(binomial(pointA + pointB, pointB));
	}

	private static long binomial(int n, int k) {
		// TODO Auto-generated method stub
		long result = 1;

		if (k > n - k) {
			k = n - k;
		}

		for (int i = 1, m = n; i <= k; i++, m--) {
			result = result * m / i;
		}

		return result;
	}
}
