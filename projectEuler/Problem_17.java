package Project_Euler;

/**
 * @author Suheng
 *
 */
public class Problem_17 {
	// This is a static array for save the englishName of the number
	// single-Digit for 0-9
	public static String[] singleDigit = { "", "one", "two", "three", "four",
			"five", "six", "seven", "eight", "nine" };
	// Digit for 10-19
	public static String[] doubleDigit = { "ten", "eleven", "twelve",
			"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			"eighteen", "nineteen" };
	// Digit for 20,30,....,90
	public static String[] tripleDigit = { "", "", "twenty", "thirty", "forty",
			"fifty", "sixty", "seventy", "eighty", "ninety" };

	public static void main(String[] args) {
		// Save the count of the number
		int count = 0;
		System.out.println(getCount(100));
		// solve the number from the 1-999
		for (int i = 1; i <= 999; i++) {
			// call the function to get the number of the counts of the enName
			count += getCount(i);
		}
		count += 11;
		System.out.println(count);
	}

	// This is a function to get the number length of the given i
	private static int getCount(int i) {
		int count = 0;
		String numStr = "" + i;
		int numLen = numStr.length();
		switch (numLen) {
		case 1:
			// 数字位数为1
			count = func1(i);
			break;
		case 2:
			// 数字位数为2
			count = func2(i);
			break;
		case 3:
			// 数字位数为3
			count = func3(i);
			break;
		}
		return count;
	}

	// 处理三位数字的方法
	private static int func3(int i) {
		int count = 0;
		int num1 = i % 100;
		int num2 = i / 100;
		count += func2(num1);
		count += Problem_17.singleDigit[num2].length();
		if (num1 != 0) {
			count += 3;
		}
		// add hundred which is 7
		count += 7;
		return count;
	}

	// 处理两位数字的方法
	private static int func2(int i) {
		int count = 0;
		int temp = i / 10;
		if (temp == 1) {
			i = i % 10;
			System.out.println("aaa" + i);
			count = Problem_17.doubleDigit[i].length();
		} else {
			// 获取个位数字
			int num1 = i % 10;
			count += func1(num1);
			// 获取十位数字
			i = i / 10;
			count += Problem_17.tripleDigit[i].length();
		}
		return count;
	}

	// 处理一位数字的方法
	private static int func1(int i) {
		return Problem_17.singleDigit[i].length();
	}
}
