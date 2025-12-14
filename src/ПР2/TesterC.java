package ПР2;

import java.util.Scanner;

public class TesterC {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Сколько компьютеров ввести?");
        int r = sn.nextInt();
        System.out.println("Введите компьютеры:название,модель,цвет");
        Comp[] a = new Comp[r];
        for (int i = 0;i < r;i++) {
            a[i] = new Comp(sn.next(),sn.nextInt(),sn.next());
        }
        Shop g = new Shop(r,a);
        g.String();
    }
}
