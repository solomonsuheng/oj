package CareerCup.Chapter1;

/**
 * Created by Suheng on 15/5/1.
 */
public class problem_1_7 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 0, 11, 12}, {13, 14, 15, 16}};
        //print origin matrix
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        set0(matrix, 4, 4);
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void set0(int[][] matrix, int row, int col) {
        int tempX = -1;
        int tempY = -1;
        //find the element of 0, and set tempX to X tempY to Y
        for (int i = 0; i < row; i++) {
            boolean flag = true;
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    tempX = i;
                    tempY = j;
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }

        //set all row to 0
        for (int i = 0; i < row; i++) {
            matrix[i][tempY] = 0;
        }
        //set all col to 0
        for (int i = 0; i < col; i++) {
            matrix[tempY][i] = 0;
        }
    }
}
