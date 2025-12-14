package ПР14;

import java.util.regex.Pattern;

public class reg4 {
    public static void main(String[] args) {
        String text1 = "(1 + 8 + ) - 9 +/ 4+";
        String text2 = "6 / 5 - 2 * 9";

        Pattern pattern = Pattern.compile("\\d(?!\\s*\\+)");

        boolean result1 = pattern.matcher(text1).find();
        boolean result2 = pattern.matcher(text2).find();
        System.out.println(result1);
        System.out.println(result2);


    }
}
