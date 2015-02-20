package Project_Euler;

/**
 * @author Suheng
 *
 */
public class Problem_18 {
	public static void main(String[] args) {
		int[] num = { 3, 7, 4, 2, 4, 6, 8, 5, 9, 3 };
		int[] num2 = { 75, 95, 64, 17, 47, 82, 18, 35, 87, 10, 20, 04, 82, 47,
				65, 19, 01, 23, 75, 03, 34, 88, 02, 77, 73, 07, 63, 67, 99, 65,
				04, 28, 06, 16, 70, 92, 41, 41, 26, 56, 83, 40, 80, 70, 33, 41,
				48, 72, 33, 47, 32, 37, 16, 94, 29, 53, 71, 44, 65, 25, 43, 91,
				52, 97, 51, 14, 70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57,
				91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48, 63, 66, 04,
				68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31, 04, 62, 98, 27, 23,
				9, 70, 98, 73, 93, 38, 53, 60, 04, 23 };

		getMaxTotalOfNumArray(num2);
	}

	// 获取数组的最大路径
	private static void getMaxTotalOfNumArray(int[] num) {
		int result = 0;
		int cursor = num.length - 1;
		int totalLevel = (int) ((Math.sqrt((8.0 * num.length + 1)) - 1) / 2);
		System.out.println("TotalLevel: " + totalLevel);
		// System.out.println("Cursor: " + cursor);

		int[] plusNum = new int[totalLevel + 1];

		for (int i = cursor, level = totalLevel; i >= 0; i -= level, level--) {
			int startNumOfLevel = num[i - level + 1];
			int startIndex = i - level + 1;
			int endIndex = i;
			System.out.println("Start of the Level number: " + startNumOfLevel
					+ ":::level" + level + ":::startIndex:" + startIndex
					+ ":::endIndex:" + endIndex);
			plusNum = plus(num, level, plusNum, startIndex, endIndex);
		}

		System.out.println(plusNum[0]);
		// System.out.println("The max path of Result is : " + result);
	}

	private static int[] plus(int[] num, int level, int[] plusNum,
			int startIndex, int endIndex) {
		int[] tempNum = new int[level];
		for (int i = 1; i < plusNum.length; i++) {
			int num1 = plusNum[i - 1] + num[startIndex + i - 1];
			int num2 = plusNum[i] + num[startIndex + i - 1];
			tempNum[i - 1] = num1 > num2 ? num1 : num2;
		}

		return tempNum;
	}

	// 获取每一行第一个数字
	public static void getFirstNumberOfLevel(int[] num) {
		int result = 0;
		int level = 1;
		int maxNum = 0;
		int[] max = { 0, num[0] };
		for (int i = 0; i < num.length; level += 1, i += level - 1) {
			// System.out.println("Start of the level number  " + (level) + ":"
			// + num[i] + " :::Index:" + i + " :::EndIndex:"
			// + (i + level - 1));
			// 返回该行中最大的数字
			// maxLevel(num, i, i + level - 1);
			max = returnMaxOfTheLevelByGivenIndex(num, max[0], level);
			System.out.println(max[0] + "::" + max[1]);
			result += max[1];
		}

		System.out.println("Finally Result:" + result);
	}

	// 根据上一行的index返回下一行中最大的数字
	private static int[] returnMaxOfTheLevelByGivenIndex(int[] num, int index,
			int level) {
		int[] max = { -1, -1 };
		if (level == 1) {
			max[0] = 0;
			max[1] = num[0];
		} else {
			// System.out.println(num[index + level - 1] + "  "
			// + num[index + level + 1 - 1]);
			max[0] = num[index + level - 1] > num[index + level + 1 - 1] ? (index
					+ level - 1)
					: (index + level + 1 - 1);
			max[1] = num[index + level - 1] > num[index + level + 1 - 1] ? num[index
					+ level - 1]
					: num[index + level + 1 - 1];
		}
		return max;
	}

	private static void maxLevel(int[] num, int startIndex, int endIndex) {
		// TODO Auto-generated method stub
		int max = -1;
		int index = -1;
		for (int i = startIndex; i <= endIndex; i++) {
			if (num[i] > max) {
				max = num[i];
				index = i;
			}
		}
		System.out.println("max:" + max + " :::Index:" + index);
	}
}
