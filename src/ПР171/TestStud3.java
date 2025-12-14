package ПР171;

import java.util.Scanner;

public class TestStud3 {
    public static void main(String[] args) {
        Group3 gr = new Group3();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nВведите число для выполнения операции:");
            System.out.println("1. Создать группу студентов");
            System.out.println("2. Добавить студента");
            System.out.println("3. Исключить студента");
            System.out.println("4. Информация о студенте");
            System.out.println("5. Исключить всю группу");
            System.out.println("6. В группе остались студенты?");
            System.out.println("0. Выход");
            System.out.print("Выберите пункт: ");

            try {

                String input = sc.nextLine();
                int n = Integer.parseInt(input);

                switch (n) {
                    case 1:
                        gr.create();
                        System.out.println("Группа создана.");
                        break;

                    case 2:
                        System.out.println("Введите имя,возраст");
                        System.out.print("Имя: ");
                        String name = sc.nextLine();
                        System.out.print("Возраст: ");
                        int age = Integer.parseInt(sc.nextLine());
                        gr.add(new Student3(name, age));
                        System.out.println("Студент добавлен.");
                        break;

                    case 3:
                        System.out.println("Введите имя и возраст студента, которого хотите исключить");
                        System.out.print("Имя: ");
                        String nam = sc.nextLine();
                        System.out.print("Возраст: ");
                        int ag = Integer.parseInt(sc.nextLine());
                        gr.delete(new Student3(nam, ag));
                        break;

                    case 4:
                        System.out.println("Введите имя,возраст");
                        System.out.print("Имя: ");
                        String namm = sc.nextLine();
                        System.out.print("Возраст: ");
                        int agg = Integer.parseInt(sc.nextLine());
                        gr.get(new Student3(namm, agg));
                        break;

                    case 5:
                        gr.zero();
                        System.out.println("Группа очищена.");
                        break;

                    case 6:
                        gr.empty();
                        break;

                    case 0:
                        System.out.println("Выход из программы...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Неверный выбор");
                }

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число!");
            } catch (Exception e) {
                System.out.println("Ошибка ввода: " + e.getMessage());
            }
        }
    }
}