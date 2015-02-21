package Project_Euler;

/**
 * @author Suheng
 *
 */
public class Problem_19 {
	public static int[] todays = new int[12];
	public static int sundayInStartMonth = 0;

	public static void main(String[] args) {
		int week = 1;
		for (int i = 1900; i <= 2000; i++) {
			// 获取该年每个月有多少天
			int[] days = getDaysOfTheYear(i);
			// 打印年份和该年所对应的每个月的天数
			System.out.println(i + ":::" + printDays(days));

			// 消耗days数组
			week = consumeDays(days, week, i);

		}

		System.out.println(sundayInStartMonth);
	}

	// 处理该年中
	private static int consumeDays(int[] days, int week, int year) {
		for (int i = 0; i < days.length; i++) {
			for (int j = 1; j <= days[i]; j++, week++) {
				if (week == 8) {
					week = 1;
				}
				if (week == 7 && j == 1) {
					if (year != 1990) {
						sundayInStartMonth++;
					}
				}
				System.out.println((i + 1) + "月" + j + "日是星期" + week);
			}
		}

		return week;
	}

	// test function to print the 12 months days
	private static String printDays(int[] days) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < days.length; i++) {
			sb.append(days[i] + " ");
		}

		return sb.toString();
	}

	// 根据传入的年份，返回该年一共有多少天
	private static int[] getDaysOfTheYear(int year) {
		// 用于存放this year每个月有多少天
		int[] days = new int[12];

		if (isLeapYear(year)) {
			// 是闰年二月有29天
			days[1] = 29;
		} else {
			// 是平年二月有28天
			days[1] = 28;
		}

		// 为其他月份赋值
		days[4 - 1] = 30;
		days[6 - 1] = 30;
		days[9 - 1] = 30;
		days[11 - 1] = 30;

		days[1 - 1] = 31;
		days[3 - 1] = 31;
		days[5 - 1] = 31;
		days[7 - 1] = 31;
		days[8 - 1] = 31;
		days[10 - 1] = 31;
		days[12 - 1] = 31;

		return days;
	}

	// judge the given year if is a leap year
	private static boolean isLeapYear(int year) {
		boolean flag = false;

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			flag = true;
		}
		return flag;
	}
}
