package ПР25;

import java.util.regex.*;

public class password {
    public static void main(String[] args) {

        String[] testPasswords = {
                "F032_Password",
                "TrySpy1",
                "smart_pass",
                "A007"
        };


        String passwordPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d_]{8,}$";


        Pattern pattern = Pattern.compile(passwordPattern);


        for (String password : testPasswords) {

            Matcher matcher = pattern.matcher(password);


            boolean isValid = matcher.matches();


            if (isValid) {
                System.out.println(password + " → Надёжный");
            } else {
                System.out.println(password + " → Слабый");
            }
        }
    }
}