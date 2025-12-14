package ПР19;

import ПР10.SearchSortable;
import ПР10.SortingStudentsByGPA;
import ПР10.Student;

import java.util.Arrays;

public class LabClassDriver {
    public static void main(String[] args) {

        SearchSortable sorter = new SortingStudentsByGPA();


        sorter.setArray(Arrays.asList(
                new Student("Фазиль", "Меликов", "Информатика", 2, "КВБО 31-24", 20),
                new Student("Амина", "Меликова", "Педагогика", 2, "ПВБО 62-24", 40),
                new Student("Карина", "Меликова", "Информатика", 2, "КВБО 31-24", 50),
                new Student("Васиф", "Меликов", "Юриспруденция", 2, "ЮВБО 92-24", 62)
        ));


        LabClassUI ui = new LabClassUI(sorter);
        ui.start();
    }
}

