package ПР14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class reg3 {
    public static void main(String[] args) {
        String text1 = "25.98 USD 44 ERR 0.004 EU 100 RUB 50 EU";
        Pattern pricePattern = Pattern.compile("\\d+(?:\\.\\d+)?\\s+(USD|RUB|EU)\\b");
        Matcher priceMatcher = pricePattern.matcher(text1);

        while (priceMatcher.find()) {
            System.out.println(priceMatcher.group());
        }
    }
}
