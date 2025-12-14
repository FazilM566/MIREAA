package ПР10;

import java.util.*;
public class SortingStudentsByGPA implements SearchSortable {
    private List<Student> iDNumber;

    public void setArray(List<Student> students) {
        iDNumber = new ArrayList<>(students);
    }

    public SortingStudentsByGPA() {
        iDNumber = new ArrayList<>();
    }


    //Быстрая сортировка

    public void quicksort() {
        if (iDNumber == null || iDNumber.size() <= 1) return;
        Comparator<Student> comparator = new GPAComparator();
        quicksort(0, iDNumber.size() - 1, comparator);
    }

    private void quicksort(int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pivotIndex = partition(low, high, comparator); // РАЗДЕЛЕНИЕ!
            quicksort(low, pivotIndex - 1, comparator);  // Левая часть
            quicksort(pivotIndex + 1, high, comparator); // Правая часть
        }
    }

    private int partition(int low, int high, Comparator<Student> comparator) {
        Student pivot = iDNumber.get(high); // Опорный элемент - последний
        int i = low - 1; // Указатель на позицию для больших элементов

        for (int j = low; j < high; j++) {
            // Если текущий элемент ДОЛЖЕН идти перед опорным
            if (comparator.compare(iDNumber.get(j), pivot) < 0) {
                i++;
                Collections.swap(iDNumber, i, j); // Ставим его влево
            }
        }
        Collections.swap(iDNumber, i + 1, high); // Ставим опорный на место
        return i + 1; // Возвращаем позицию опорного
    }

    //Сортировка слиянием

    public void mergeSort() {
        if (iDNumber == null || iDNumber.size() <= 1) return;
        Comparator<Student> comparator = new GPAComparator();
        iDNumber = mergeSort(iDNumber, comparator);
    }

    private List<Student> mergeSort(List<Student> list, Comparator<Student> comparator) {
        if (list.size() <= 1) return list; // Базовый случай

        int mid = list.size() / 2;
        // РЕКУРСИВНО сортируем левую и правую половины
        List<Student> left = mergeSort(new ArrayList<>(list.subList(0, mid)), comparator);
        List<Student> right = mergeSort(new ArrayList<>(list.subList(mid, list.size())), comparator);

        return merge(left, right, comparator); // СЛИВАЕМ отсортированные половины
    }

    private List<Student> merge(List<Student> left, List<Student> right, Comparator<Student> comparator) {
        List<Student> result = new ArrayList<>();
        int i = 0, j = 0; // Указатели на левый и правый массивы

        // Пока есть элементы в ОБОИХ массивах
        while (i < left.size() && j < right.size()) {
            // Используем компаратор для сравнения
            if (comparator.compare(left.get(i), right.get(j)) < 0) {
                result.add(left.get(i++)); // Левый элемент ДОЛЖЕН идти первым
            } else {
                result.add(right.get(j++)); // Правый элемент ДОЛЖЕН идти первым
            }
        }

        // Добавляем остатки
        while (i < left.size()) result.add(left.get(i++));
        while (j < right.size()) result.add(right.get(j++));

        return result;
    }


    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
        System.out.println();
    }

    public void sortBySurname() {
        iDNumber.sort(new SurnameComparator());
    }

    // объединение двух списков

    public void mergeTwoLists(List<Student> list1, List<Student> list2) {
        // Создаем новый список, объединяя оба списка
        iDNumber = new ArrayList<>();
        iDNumber.addAll(list1);
        iDNumber.addAll(list2);

        // Сортируем объединенный список по среднему баллу (убывание)
        mergeSort();
    }

    public static void main(String[] args) {

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        List<Student> students1 = Arrays.asList(
                new Student("Фазиль", "Меликов", "Информатика", 2, "КВБО 31-24", 20),
                new Student("Амина", "Меликов", "Педагогика", 2, "ПВБО 62-24", 40),
                new Student("Карина", "Меликова", "Информатика", 2, "КВБО 31-24", 50),
                new Student("Васиф", "Меликов", "Юриспруденция", 2, "ЮВБО 92-24", 62)
        );

        List<Student> students2 = Arrays.asList(
                new Student("Васиф", "Меликов", "Юриспруденция", 2, "ЮВБО 92-24", 62.0),
                new Student("Эльвин", "Гасанов", "Математика", 3, "МВБО 41-23", 45.0),
                new Student("Лейла", "Аббасова", "Физика", 1, "ФВБО 11-25", 38.0)
        );

        sorter.setArray(students1);

        System.out.println("Исходный список ");
        sorter.outArray();

        System.out.println("Быстрая сортировка по среднему баллу (убывание)");
        sorter.quicksort();
        sorter.outArray();

        System.out.println("Сортировка слиянием по среднему баллу (убывание)");
        sorter.setArray(students1);
        sorter.mergeSort();
        sorter.outArray();

        System.out.println("=== Сортировка по фамилии (убывание) ===");
        sorter.sortBySurname();
        sorter.outArray();

        System.out.println("ОБЪЕДИНЕННЫЙ И ОТСОРТИРОВАННЫЙ СПИСОК");
        sorter.mergeTwoLists(students1, students2);
        sorter.outArray();

    }

    @Override
    public List<Student> getStudents() {
        return new ArrayList<>(iDNumber);
    }

    @Override
    public void sortByGPA() {
        quicksort();
    }

    @Override
    public Student findStudentByFullName(String fullName) throws StudentNotFoundException, EmptyStringException {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new EmptyStringException("ФИО не может быть пустым");
        }

        String searchName = fullName.trim().toLowerCase();

        for (Student student : iDNumber) {
            String studentFullName = (student.getName() + " " + student.getSurname()).toLowerCase();
            if (studentFullName.equals(searchName)) {
                return student;
            }
        }

        throw new StudentNotFoundException("Студент с ФИО '" + fullName + "' не найден");
    }

    public String getFullName(Student student) {
        return student.getName() + " " + student.getSurname();
    }


}
