package ПР171;

import java.util.Scanner;

public class TestStud {
    public static void main(String[] args) {
        Group gr = new Group();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Меню картотеки студентов ===");
            System.out.println("1. Создать новую группу");
            System.out.println("2. Добавить студента");
            System.out.println("3. Удалить студента");
            System.out.println("4. Найти студента");
            System.out.println("5. Очистить группу");
            System.out.println("6. Проверить, пуста ли группа");
            System.out.println("0. Выход");
            System.out.print("Выберите пункт меню: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        gr.create();
                        System.out.println("Новая группа создана!");
                        break;

                    case 2:
                        System.out.print("Введите имя студента: ");
                        sc.nextLine();
                        String name = sc.nextLine();
                        System.out.print("Введите возраст студента: ");
                        int age = sc.nextInt();
                        gr.add(new Student(name, age));
                        System.out.println("Студент " + name + " добавлен в группу!");
                        break;

                    case 3:
                        System.out.print("Введите имя студента для удаления: ");
                        sc.nextLine();
                        String delName = sc.nextLine();
                        System.out.print("Введите возраст студента: ");
                        int delAge = sc.nextInt();

                        gr.delete(new Student(delName, delAge));
                        break;

                    case 4:
                        System.out.print("Введите имя студента для поиска: ");
                        sc.nextLine();
                        String findName = sc.nextLine();
                        System.out.print("Введите возраст студента: ");
                        int findAge = sc.nextInt();

                        gr.get(new Student(findName, findAge));
                        break;

                    case 5:
                        gr.zero();
                        System.out.println("Группа полностью очищена!");
                        break;

                    case 6:
                        gr.empty();
                        break;

                    case 0:
                        System.out.println("Выход из программы...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Неверный выбор! Введите число от 0 до 6.");
                }

            } catch (Exception e) {
                System.out.println("Ошибка ввода! Пожалуйста, вводите корректные данные.");
                sc.nextLine();
            }
        }
    }
}