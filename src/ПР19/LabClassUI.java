package ПР19;

import ПР10.EmptyStringException;
import ПР10.SearchSortable;
import ПР10.Student;
import ПР10.StudentNotFoundException;

import java.util.*;

public class LabClassUI {
    private SearchSortable sorter;
    private Scanner scanner;

    public LabClassUI(SearchSortable sorter) {
        this.sorter = sorter;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        loadTestData();

        while (true) {
            System.out.println("\n=== Меню ===");
            System.out.println("1. Вывести список");
            System.out.println("2. Сортировать по GPA");
            System.out.println("3. Сортировать по фамилии");
            System.out.println("4. Найти студента");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> showStudents();
                case 2 -> sortByGPA();
                case 3 -> sortBySurname();
                case 4 -> searchStudent();
                case 0 -> { scanner.close(); return; }
                default -> System.out.println("Неверный выбор");
            }
        }
    }

    private void loadTestData() {
        List<Student> students = Arrays.asList(
                new Student("Фазиль", "Меликов", "Информатика", 2, "КВБО 31-24", 20),
                new Student("Амина", "Меликова", "Педагогика", 2, "ПВБО 62-24", 40),
                new Student("Карина", "Меликова", "Информатика", 2, "КВБО 31-24", 50),
                new Student("Васиф", "Меликов", "Юриспруденция", 2, "ЮВБО 92-24", 62)
        );
        sorter.setArray(students);
        System.out.println("Тестовые данные загружены");
    }

    private void showStudents() {
        System.out.println("\nСписок студентов:");
        sorter.outArray();
    }

    private void sortByGPA() {
        sorter.sortByGPA();
        System.out.println("Сортировка по GPA выполнена");
        showStudents();
    }

    private void sortBySurname() {
        sorter.sortBySurname();
        System.out.println("Сортировка по фамилии выполнена");
        showStudents();
    }

    private void searchStudent() {
        System.out.print("Введите ФИО (Имя Фамилия): ");
        String name = scanner.nextLine();

        try {
            Student found = sorter.findStudentByFullName(name);
            System.out.println("Найден: " + found);
        } catch (EmptyStringException | StudentNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}