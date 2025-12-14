package ПР13;

import java.util.*;

public class stroki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        getLine(str);
    }

    public static void getLine(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.setLength(0);
            result.append(words[i]);

            List<String> remaining = new ArrayList<>(Arrays.asList(words));
            remaining.remove(i);

            boolean changed;
            do {
                changed = false;
                for (int j = 0; j < remaining.size(); j++) {
                    String word = remaining.get(j);
                    String lastChar = result.substring(result.length() - 1).toLowerCase();
                    String firstChar = word.substring(0, 1).toLowerCase();

                    if (lastChar.equals(firstChar)) {
                        result.append(" ").append(word);
                        remaining.remove(j);
                        changed = true;
                        break;
                    }
                }
            } while (changed && !remaining.isEmpty());

            if (remaining.isEmpty()) break;
        }

        System.out.println(result);
    }
}