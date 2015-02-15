package Project_Euler;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Suheng
 *
 */
public class Problem_1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				// num multiples of 3 or 5 than save it to the list
				list.add(i);
			}
		}
		int sum = getListSum(list);
		System.out.println(sum);
	}

	// get All the sum number of the list
	private static int getListSum(List<Integer> list) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (Integer i : list) {
			sum += i;
		}
		return sum;
	}

}
