package CareerCup.Chapter1;

/**
 * Created by Suheng on 15/5/1.
 */
public class problem_1_8 {
    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        System.out.println(isSubString(str1, str2));
    }

    private static boolean isSubString(String str1, String str2) {
        int[] num1 = new int[256];
        int[] num2 = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            num1[str1.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            num2[str1.charAt(i)]++;
        }

        for (int i = 0; i < num1.length; i++) {
            if (num1[i] != num2[i]) {
                return false;
            }
        }
        return true;
    }
}
