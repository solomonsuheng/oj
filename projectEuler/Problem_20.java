package Project_Euler;

import java.math.BigInteger;

/**
 * @author Suheng
 *
 */
public class Problem_20 {
	public static void main(String[] args) {
		BigInteger bi = new BigInteger("1");
		for (int i = 100; i >= 1; i--) {
			BigInteger temp = new BigInteger("" + i);
			bi = bi.multiply(temp);
		}
		System.out.println(count(bi.toString()));
	}

	private static int count(String num) {
		int sum = 0;
		for (int i = 0; i < num.length(); i++) {
			int nn = Integer.parseInt("" + num.charAt(i));
			sum += nn;
		}
		return sum;
	}

}
