package CareerCup.Chapter1;

/**
 * Created by Suheng on 15/5/1.
 */
public class problem_1_5 {
    public static void main(String[] args) {
        String str = "asldjlsk alskjd laksj asldkjaslal aslkda l  alskdj";
        System.out.println(replaceAllTheSpace(str));
    }

    private static String replaceAllTheSpace(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
