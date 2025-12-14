package ПР10;

import java.util.Comparator;

public class SurnameComparator implements Comparator<Student> {
    public int compare(Student a, Student b) {
        // Для убывающей сортировки сравниваем b с a
        return b.getSurname().compareTo(a.getSurname());
    }

}
