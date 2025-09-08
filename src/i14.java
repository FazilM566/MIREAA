import java.util.Arrays;
import java.util.Scanner;
public class i14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int ln = sc.nextInt();
        System.out.println("Введите числа массива");
        int [] ms = new int[ln];
        int sum = 0;
        do {
            ms[ln-1] = sc.nextInt();
            sum += ms[ln-1];
            ln -=1;
        } while (ln>0) ;
        System.out.println("Сумма элементов массива равна " + sum);
        System.out.println("Минимальный элемент массива равен " + Arrays.stream(ms).min().getAsInt());
        System.out.println("Максимальный элемент массива равен " + Arrays.stream(ms).max().getAsInt());
    }
}