package ПР11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class date4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Введите дату (год, месяц(0-11), день, час, минута):");

                int year = sc.nextInt();
                int month = sc.nextInt();
                int day = sc.nextInt();
                int hour = sc.nextInt();
                int minute = sc.nextInt();


                if (month < 0 || month > 11) {
                    System.out.println("Ошибка: Месяц должен быть от 0 до 11");
                    continue;
                }

                if (hour < 0 || hour > 23) {
                    System.out.println("Ошибка: Часы должны быть от 0 до 23");
                    continue;
                }

                if (minute < 0 || minute > 59) {
                    System.out.println("Ошибка: Минуты должны быть от 0 до 59");
                    continue;
                }


                Calendar calendar = new GregorianCalendar();
                calendar.setLenient(false);
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, month);
                calendar.set(Calendar.DAY_OF_MONTH, day);
                calendar.set(Calendar.HOUR_OF_DAY, hour);
                calendar.set(Calendar.MINUTE, minute);
                calendar.set(Calendar.SECOND, 0);
                calendar.set(Calendar.MILLISECOND, 0);


                Date date = calendar.getTime();

                System.out.println("Корректная дата: " + date);
                break;

            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введите целые числа!");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: Некорректная дата! Проверьте день месяца.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Ошибка: Некорректные данные даты!");
                sc.nextLine();
            }
        }

        sc.close();
    }
}