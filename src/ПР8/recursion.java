package ПР8;

import java.util.Scanner;

public class recursion {
    public static void mat(int n){
        if (n == 1) {
            System.out.println(1);
        }
        else {
            mat(n-1);
            System.out.println(n);
        }
    }
    public static int sum(int n){
        if (n == 1) {
            return 1;
        }
        else if(n == 2) {
            return 2;
        }
        else if(n == 3) {
            return 3;
        }
        else if(n == 4) {
            return 4;
        }
        else if(n == 5) {
            return 5;
        }else if(n == 6) {
            return 6;
        }
        else if(n == 7) {
            return 7;
        }
        else if(n == 8) {
            return 8;
        }
        else if(n == 9) {
            return 9;
        }
        else if(n == 0) {
            return 0;
        }
        else{
            return sum(n / 10) + sum(n % 10);
        }
    }
    public static void r(int n){
        if (n == 1) {
            System.out.print(1);
        }
        else if(n == 2) {
            System.out.print(2);
        }
        else if(n == 3) {
            System.out.print(3);
        }
        else if(n == 4) {
            System.out.print(4);
        }
        else if(n == 5) {
            System.out.print(5);
        }else if(n == 6) {
            System.out.print(6);
        }
        else if(n == 7) {
            System.out.print(7);
        }
        else if(n == 8) {
            System.out.print(8);
        }
        else if(n == 9) {
            System.out.print(9);
        }
        else if(n == 0) {
            System.out.print(0);
        }
        else{
            r(n % 10);
            r(n /10);
        }

    }
    public static void main(String[] args) {
        System.out.println("Введите число для подсчёта суммы цифр");
        Scanner sn = new Scanner(System.in);
        int s1;
        while (true) {
            try {
                s1 = sn.nextInt();
                if (s1 <= 0) {
                    System.out.println("Ошибка!");
                    continue;
                }
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Ошибка!");
                sn.next();
            }
        }
        System.out.println(sum(s1));
        System.out.println("Введите число для вывода разворота числа");
        int s2;
        while (true) {
            try {
                s2 = sn.nextInt();
                if (s2 <= 0) {
                    System.out.println("Ошибка!");
                    continue;
                }
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Ошибка!");
                sn.next();
            }
        }
        r(s2);
        System.out.println();
        System.out.println("Введите число n для вывода чисел от 1 до n");
        int s3;
        while (true) {
            try {
                s3 = sn.nextInt();
                if (s3 <= 0) {
                    System.out.println("Ошибка!");
                    continue;
                }
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Ошибка!");
                sn.next();
            }
        }
        mat(s3);
    }
}
