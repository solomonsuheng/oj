package CareerCup.Chapter1;

/**
 * Created by Suheng on 15/5/1.
 */
public class problem_1_1 {
    /*
    * Implement an algorithm to determine if a string has all unique characters.
    * What if you can not use additional data structures?
    * */
    public static void main(String[] args) {
        String string = "aHezlo,wia";//The string which is to be tested
        //Method 1
        System.out.println("(Method_1)If the string has all unique characters? " + determineStringAllUnique(string));
        //Method 2
        System.out.println("(Method_2)If the string has all unique characters? " + determineStringAllUnique2(string));
    }

    /*
    * This is a algorithm which is O(n) times cost
    * */
    public static boolean determineStringAllUnique2(String str) {
        boolean flag = true;
        String tempStr = str.toLowerCase();
        int[] num = new int[26];
        for (int i = 0; i < tempStr.length(); i++) {
            if (tempStr.charAt(i) > 96 && tempStr.charAt(i) < (97 + 26) && num[(tempStr.charAt(i) - 97)]++ != 0) {
                return false;
            }
        }
        return flag;
    }


    /*
    * This is a algorithm which is O(n2) times cost
    * */
    public static boolean determineStringAllUnique(String str) {
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }

        return flag;
    }
}