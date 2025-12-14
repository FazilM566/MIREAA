package ПР11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Studentt {
    private String name;
    private String surname;
    private String specialty;
    private int course;
    private String group;
    private double averageScore;
    private Date date;

    public Studentt(String name, String surname, String specialty, int course, String group, double averageScore, Date date) {
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.averageScore = averageScore;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public void toString(SimpleDateFormat formater) {
        System.out.println( "ПР17.ПР171.Student{" +
                "averageScore=" + averageScore +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specialty='" + specialty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}');
        System.out.println("Дата рождения: ");
        System.out.println(formater.format(date));
    }


}
