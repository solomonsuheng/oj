package Project_Euler;

/**
 * @author Suheng
 *
 */
public class Problem_24 {
	public static int con = 0;

	public static void main(String[] args) {
		String str = "0123456789";
		String result = "";
		permutation(str, result, str.length());
	}

	private static void permutation(String str, String result, int length) {
		if (result.length() == length) {
			con++;
			if (con == 1000000) {
				System.out.println(result);
			}
		} else {
			for (int i = 0; i < str.length(); i++) {
				// 检查是否存在了该字符
				if (result.indexOf(str.charAt(i)) < 0) {
					permutation(str, result + str.charAt(i), length);
				}
			}
		}
	}
}
