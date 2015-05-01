package CareerCup.Chapter1;

/**
 * Created by Suheng on 15/5/1.
 */
public class problem_1_2 {
    public static void main(String[] args) {
        char[] c = {'a', 'b', 'c', 'd', '\0'};
        System.out.print(reverseCString(c));

    }

    public static char[] reverseCString(char[] c) {
        for (int i = 0, j = c.length - 2; i < j; i++, j--) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }
        return c;
    }

}
