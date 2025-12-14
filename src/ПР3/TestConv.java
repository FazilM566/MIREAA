package ПР3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class TestConv {
    public static void main(String[] args) {
        System.out.println("Перевод доллара в другие валюты");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число(в доларрах)");
        double w = sc.nextDouble();
        Locale.setDefault(Locale.US);
        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance();
        System.out.println("Число в текущей локали: " + numberFormat1.format(w));
        System.out.println("Введите страну , в волюту которой хотите перевести ваше число(France,China,Korea)");
        String s = sc.next();
        Conventer c = new Conventer(w,s);
        c.format();
    }
}
