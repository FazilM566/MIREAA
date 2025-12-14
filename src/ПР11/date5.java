package ПР11;

import java.util.ArrayList;
import java.util.LinkedList;

public class date5 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println("Операция создания и добавления элементов");
        ArrayList<String> people = new ArrayList<String>();
        people.add("Fazil");
        people.add("Amina");
        people.add("Vasif");
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Для ArrayList: ");
        System.out.println(estimatedTime + " нс");
        long startTime1 = System.nanoTime();
        var people1 = new LinkedList<String>();
        people1.add("Fazil");
        people1.add("Amina");
        people1.add("Vasif");
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println("Для LinkedList: ");
        System.out.println(estimatedTime1 + " мс");
        System.out.println("Операция удаления элемента");
        long startTime2 = System.nanoTime();
        people.remove("Amina");
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println("Для ArrayList: ");
        System.out.println(estimatedTime2 + " нс");
        long startTime3 = System.nanoTime();
        people1.remove("Amina");
        long estimatedTime3 = System.nanoTime() - startTime3;
        System.out.println("Для LinkedList: ");
        System.out.println(estimatedTime3 + " нс");
        System.out.println("Операция поиска элемента");
        long startTime4 = System.nanoTime();
        people.contains("Amina");
        long estimatedTime4 = System.nanoTime() - startTime4;
        System.out.println("Для ArrayList: ");
        System.out.println(estimatedTime4 + " нс");
        long startTime5 = System.nanoTime();
        people1.contains("Amina");
        long estimatedTime5 = System.nanoTime() - startTime5;
        System.out.println("Для LinkedList: ");
        System.out.println(estimatedTime5 + " нс");
    }
}
