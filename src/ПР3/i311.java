package ПР3;

import java.util.*;
public class i311 {
    public static void main(String[] args) {
        System.out.println("Генерация массива методом random() класса Math");
        double[] m = {Math.random(),Math.random(),Math.random(),Math.random(),Math.random(),Math.random()};
        System.out.println("Иссходный массив");
        for (int i = 0;i<m.length;i++) {
            System.out.println(m[i]);
        }
        Arrays.sort(m);
        System.out.println("Отсортированный массив");
        for (int i = 0;i<m.length;i++) {
            System.out.println(m[i]);
        }
        System.out.println("Генерация массива методом класс Random");
        Random rand = new Random();
        double[] m1 = {rand.nextDouble(),rand.nextDouble(),rand.nextDouble(),rand.nextDouble(),rand.nextDouble()};
        System.out.println("Иссходный массив");
        for (int i = 0;i<m1.length;i++) {
            System.out.println(m1[i]);
        }
        Arrays.sort(m1);
        System.out.println("Отсортированный массив");
        for (int i = 0;i<m1.length;i++) {
            System.out.println(m1[i]);
        }
    }
}
