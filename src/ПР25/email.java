package ПР25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email {
    public static void main(String[] args) {

        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        String[] testEmails = {
                "user@example.com",
                "root@localhost",
                "myhost@@com.ru",
                "@my.ru",
                "Julia String"
        };


        Pattern pattern = Pattern.compile(emailPattern);

        for (String email : testEmails) {
            boolean isValid = pattern.matcher(email).matches();
            System.out.println(email + " → " + (isValid ? "Подходит" : "Не подходит"));
        }
    }
}