package ПР1;

import java.util.Scanner;
public class i17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        long ch = s.nextInt();
        System.out.print("Факториал числа равен " + factorial(ch));
    }
    public static long factorial(long i) {
        long f = 1;
        for (long j = 1; j < i + 1;j++) {
            f*= j;
        }
        return f;
    }
}
