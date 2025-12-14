package ПР21;

import java.util.Arrays;
import java.util.List;

public class i211 {


    public static <T> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }


    public static void main(String[] args) {
        String[] stringArray = {"Hello", "World"};
        List<String> stringList = convertArrayToList(stringArray);
        System.out.println("Список строк: " + stringList);

        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = convertArrayToList(intArray);
        System.out.println("Список чисел: " + intList);
    }
}