import java.sql.SQLOutput;
import java.util.Random;

public class lab2_3 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(-100, 100);
            }
        }

        int min = matrix[0][0];
        int[] index = new int[2];

        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    index[0] = i;
                    index[1] = j;
                }
            }
        }

        System.out.println(min);
        for (int i : index) {
            System.out.print(i);
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
