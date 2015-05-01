package CareerCup.Chapter1;

/**
 * Created by Suheng on 15/5/1.
 */
public class problem_1_3 {
    public static void main(String[] args) {
        String duplicateStr = "HeloWorld";
        removeDuplicateStr(duplicateStr);
    }

    private static void removeDuplicateStr(String duplicateStr) {
        int[] flag = new int[256];
        for (int i = 0; i < duplicateStr.length(); i++) {
            flag[duplicateStr.charAt(i)]++;
        }
        for (int i = 0; i < duplicateStr.length(); i++) {
            if (flag[duplicateStr.charAt(i)] == 1) {
                System.out.print(duplicateStr.charAt(i));
            } else if (flag[duplicateStr.charAt(i)] > 1) {
                System.out.print(duplicateStr.charAt(i));
                flag[duplicateStr.charAt(i)] = -1;
            }
        }
    }
}
