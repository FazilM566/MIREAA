package ПР10;

import java.util.List;

public interface SearchSortable {
    void sortByGPA();
    void sortBySurname();
    Student findStudentByFullName(String fullName) throws StudentNotFoundException, EmptyStringException;
    List<Student> getStudents();
    void setArray(List<Student> students);
    void outArray();
}