package Project_Euler;

import java.math.BigInteger;

/**
 * @author Suheng
 *
 */
public class Problem_25 {
	public static void main(String[] args) {
		BigInteger n1 = new BigInteger("1");
		BigInteger n2 = new BigInteger("1");
		int count = 2;
		BigInteger n3 = null;
		while (true) {
			n3 = n1.add(n2);
			count++;
			if (getNumCount(n3) >= 1000) {
				break;
			}
			n1 = n2;
			n2 = n3;
		}
		System.out.println(count);
		System.out.println(n3.toString());
	}

	private static int getNumCount(BigInteger num) {
		int count = 0;
		count = num.toString().length();

		return count;
	}
}
