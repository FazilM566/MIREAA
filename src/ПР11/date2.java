package ПР11;

import java.util.Date;
import java.util.Scanner;

public class date2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date date1 = new Date();

        System.out.print("Введите дату в формате unix(количество секунд, прошедших с полуночи (00:00:00 UTC) 1 января 1970 года ): ");

        try {
            long date2 = scanner.nextLong();
            Date userDate = new Date(date2 * 1000); // Умножаем на 1000, т.к. Date ожидает миллисекунды

            if (userDate.before(date1)) {
                System.out.println("Прошлая дата");
            } else if (userDate.after(date1)) {
                System.out.println("Будущая дата");
            } else {
                System.out.println("Текущая дата");
            }

        } catch (Exception e) {
            System.out.println("Ошибка: Неправильный формат ввода. Пожалуйста, введите целое число (количество секунд).");
        } finally {
            scanner.close();
        }
    }
}