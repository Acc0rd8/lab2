import java.util.Scanner;

public class lab2_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int len = sc.nextInt();

        int[] mas = new int[len];

        for (int i = 0; i < len; i++){
            System.out.println("Введите цифру:");
            int num = sc.nextInt();
            mas[i] = num;
        }

        final int COUNT_MAX = 3;
        int[] count_max_mas = new int[COUNT_MAX];
        int max;

        for (int i = 0; i < COUNT_MAX; i++) {
            max = mas[0];
            for (int j = 0; j < len; j++) {
                if (mas[j] > max){
                    max = mas[j];
                    count_max_mas[i] = max;
                }
            }
            for (int j = 0; j < len; j++) {
                if (mas[j] == max) {
                    mas[j] = 0;
                }
            }
        }

        for (int i = 0; i < COUNT_MAX; i++) {
            System.out.println(count_max_mas[i]);
        }
    }
}