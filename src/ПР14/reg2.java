package ПР14;

import java.util.regex.Pattern;

public class reg2 {
    public static void main(String[] args) {
        String input = "abcdefghijklmnoasdfasdpqrstuv18340";
        boolean found = Pattern.matches("abcdefghijklmnopqrstuv18340", input);
        for (int i = 0;i < input.length();i++){


        }
        if(found)
            System.out.println("Является");
        else
            System.out.println("Не является");

    }
}
