package ПР25;

import java.util.Scanner;
import java.util.regex.*;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== МАНИПУЛЯЦИЯ СТРОКАМИ С ПОМОЩЬЮ РЕГУЛЯРНЫХ ВЫРАЖЕНИЙ ===");
        System.out.println();


        System.out.print("Введите строку для обработки: ");
        String inputString = scanner.nextLine();

        // 2. Получаем регулярное выражение-разделитель
        System.out.println("\nПримеры регулярных выражений для разделения:");
        System.out.println("1. \\\\s+    - по пробелам(один слэш для ввода)");
        System.out.println("2. ,        - по запятым");
        System.out.println("3. ;        - по точкам с запятой");
        System.out.println("4. \\\\d+    - по цифрам(один слэш для ввода)");
        System.out.println("5. [.,;]\\\\s* - по знакам препинания с пробелами(один слэш для ввода)");
        System.out.print("Введите регулярное выражение для разделения строки: ");
        String delimiterPattern = scanner.nextLine();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("РЕЗУЛЬТАТЫ ОБРАБОТКИ:");
        System.out.println("=".repeat(50));

        try {
            // 3. Разбиваем строку с помощью регулярного выражения
            Pattern pattern = Pattern.compile(delimiterPattern);
            String[] parts = pattern.split(inputString);

            System.out.println("\n1. Разбиение строки на элементы:");
            System.out.println("   Использован шаблон: " + delimiterPattern);

            for (int i = 0; i < parts.length; i++) {
                System.out.println("   Элемент " + (i + 1) + ": \"" + parts[i] + "\"");
            }

            if (parts.length == 1 && parts[0].equals(inputString)) {
                System.out.println("   (Строка не была разделена - разделитель не найден)");
            }

        } catch (PatternSyntaxException e) {
            System.out.println("ОШИБКА! Неправильное регулярное выражение: " + e.getMessage());
            System.out.println("Введите например: \\\\d+  (для разделения по цифрам)");
        }


        // 4. Поиск подстрок по другому регулярному выражению
        System.out.print("\nВведите регулярное выражение для поиска в строке: ");
        String searchPattern = scanner.nextLine();

        try {
            Pattern searchP = Pattern.compile(searchPattern);
            Matcher matcher = searchP.matcher(inputString);

            System.out.println("\n2. Найденные подстроки:");
            int count = 0;
            while (matcher.find()) {
                count++;
                System.out.println("   Совпадение " + count + ": \"" + matcher.group() +
                        "\" (позиция: " + matcher.start() + "-" + matcher.end() + ")");
            }
            if (count == 0) {
                System.out.println("   Совпадений не найдено");
            }
        } catch (PatternSyntaxException e) {
            System.out.println("ОШИБКА! Неправильное регулярное выражение: " + e.getMessage());
        }

        // 5. Замена по регулярному выражению
        System.out.print("\nВведите регулярное выражение для замены: ");
        String replacePattern = scanner.nextLine();
        System.out.print("Введите строку для замены: ");
        String replacement = scanner.nextLine();

        try {
            String replacedString = inputString.replaceAll(replacePattern, replacement);
            System.out.println("\n3. Результат замены:");
            System.out.println("   Исходная строка: \"" + inputString + "\"");
            System.out.println("   После замены:    \"" + replacedString + "\"");
        } catch (PatternSyntaxException e) {
            System.out.println("ОШИБКА! Неправильное регулярное выражение: " + e.getMessage());
        }

        // 6. Проверка соответствия всей строки шаблону
        System.out.print("\nВведите регулярное выражение для проверки всей строки: ");
        String fullMatchPattern = scanner.nextLine();

        try {
            boolean isFullMatch = inputString.matches(fullMatchPattern);
            System.out.println("\n4. Проверка всей строки:");
            System.out.println("   Строка \"" + inputString + "\" " +
                    (isFullMatch ? "полностью соответствует" : "НЕ соответствует") +
                    " шаблону \"" + fullMatchPattern + "\"");
        } catch (PatternSyntaxException e) {
            System.out.println("ОШИБКА! Неправильное регулярное выражение: " + e.getMessage());
        }

        scanner.close();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("ОБРАБОТКА ЗАВЕРШЕНА");
    }
}