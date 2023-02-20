import java.util.Scanner;

public class Laboratornayaa4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = in.nextInt();
        int[] num = new int[n];

        System.out.println("Введите числа: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        System.out.println("Минимальный элементы: " + min_array(num));
        System.out.println("Среднее значение: " + sr_arid(num));
        double a = min_array(num) + sr_arid(num);
        System.out.println("Сумма минимального элемента и среднего значения: " + a);
    }

    static int min_array(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    static double sr_arid(int[] array) {
        double a = 0;
        for (int i : array) {
            a += i;
        }
        return a / array.length;
    }
}