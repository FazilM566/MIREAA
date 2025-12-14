package ПР14;

import java.util.Scanner;
import java.util.regex.Pattern;

public class reg5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();


        boolean found = false;


        if (input.charAt(3) == '0' && input.charAt(4) == '2') { // Заменил substring() на charAt() - для получения отдельных символов
            if (input.charAt(6) == '1') {
                found = Pattern.matches("[0-2][0-9]/02/19\\d{2}", input);
            } else {
                found = Pattern.matches("[0-2][0-9]/02/[2-9]\\d{3}", input);
            }
        }

        else if(input.charAt(0) == '3') {
            if (input.charAt(6) == '1') {
                if (input.charAt(3) == '0') {
                    found = Pattern.matches("3[0-1]/0[1-9]/19\\d{2}", input);
                } else if(input.charAt(3) == '1') {
                    found = Pattern.matches("3[0-1]/1[0-2]/19\\d{2}", input);
                }
            } else {
                if (input.charAt(3) == '0') {
                    found = Pattern.matches("3[0-1]/0[1-9]/[2-9]\\d{3}", input);
                } else if(input.charAt(3) == '1') {
                    found = Pattern.matches("3[0-1]/1[0-2]/[2-9]\\d{3}", input);
                }
            }
        }

        else {
            if (input.charAt(6) == '1') {
                if (input.charAt(3) == '0') {
                    found = Pattern.matches("[0-2][0-9]/0[1-9]/19\\d{2}", input);
                } else if(input.charAt(3) == '1') {
                    found = Pattern.matches("[0-2][0-9]/1[0-2]/19\\d{2}", input);
                }
            } else {
                if (input.charAt(3) == '0') {
                    found = Pattern.matches("[0-2][0-9]/0[1-9]/[2-9]\\d{3}", input);
                } else if(input.charAt(3) == '1') {
                    found = Pattern.matches("[0-2][0-9]/1[0-2]/[2-9]\\d{3}", input);
                }
            }
        }

        if(found)
            System.out.println("Является");
        else
            System.out.println("Не является");
    }
}