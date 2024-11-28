import java.util.Scanner;
import java.util.Random;

public class lab2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Введите размерность квадратной матрицы (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(-50, 70);
            }
        }


        int total = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((i + j == matrix.length - 1) && (matrix[i][j] >= 0)) {
                    total += matrix[i][j];
                    count++;
                }
            }
        }

        System.out.println(total);
        System.out.println(count);
        System.out.println(total/count);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
