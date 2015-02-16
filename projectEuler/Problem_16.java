package Project_Euler;

import java.math.BigInteger;

/**
 * @author Suheng
 *
 */
public class Problem_16 {
	public static void main(String[] args) {
		BigInteger baseNumber = new BigInteger("2");
		int powNumber = 1000;

		String str = baseNumber.pow(powNumber).toString();
		System.out.println(len(str));
	}

	private static int len(String str) {
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			result += Integer.valueOf("" + str.charAt(i));
		}

		return result;
	}
}
