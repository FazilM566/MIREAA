package ПР10;

import java.util.Comparator;

public class GPAComparator implements Comparator<Student> {
    public int compare(Student a, Student b) {
        // Для УБЫВАЮЩЕЙ сортировки: сравниваем b с a
        return Double.compare(b.getAverageScore(), a.getAverageScore());
    }

}
