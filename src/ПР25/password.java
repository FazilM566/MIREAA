package ПР25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пароль для проверки ");
        String a = sc.nextLine();
        String passwordPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d_]{8,}$";
        Pattern pattern = Pattern.compile(passwordPattern);

        Matcher matcher = pattern.matcher(a);


        boolean isValid = matcher.matches();


        if (isValid) {
            System.out.println(a + " → Надёжный");
        } else {
            System.out.println(a + " → Слабый");
        }


    }
}