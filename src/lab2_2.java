import java.util.Scanner;

public class lab2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива a(n):");
        int len_a = sc.nextInt();

        double[] mas_a = new double[len_a];
        double[] mas_b = new double[len_a];

        for (int i = 0; i < len_a; i++){
            System.out.println("Введите число для массива a(n)");
            mas_a[i] = sc.nextInt();
        }

        int index = 0;
        for (int i = 0; i < len_a; i++) {
            if (mas_a[i] >= 0) {
                mas_b[index] = mas_a[i] / 5;
                index += 1;
            }
        }

        for (int i = 0; i < mas_b.length - 1; i++) {
            for (int j = i + 1; j < mas_b.length; j++) {
                if (mas_b[j] < mas_b[i]){
                    double temp = mas_b[j];
                    mas_b[j] = mas_b[i];
                    mas_b[i] = temp;
                }
            }
        }

        for (int i = 0; i < mas_b.length; i++) {
            System.out.println(mas_b[i]);
        }

    }
}