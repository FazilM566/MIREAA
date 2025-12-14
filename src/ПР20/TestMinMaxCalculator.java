package ПР20;

public class TestMinMaxCalculator {
    public static void main(String[] args) {

        Integer[] intArray = {3, 7, 1, 9, 4};
        MinMax<Integer> minMaxInt = new MinMax<>(intArray);
        System.out.println("Минимум: " + minMaxInt.Min());
        System.out.println("Максимум: " + minMaxInt.Max());

        String[] strArray = {"apple", "orange", "banana", "kiwi"};
        MinMax<String> minMaxStr = new MinMax<>(strArray);
        System.out.println("Минимум (строка): " + minMaxStr.Min());
        System.out.println("Максимум (строка): " + minMaxStr.Max());


        System.out.println("Сумма: " + Calculator.sum(5, 3.5));
        System.out.println("Умножение: " + Calculator.multiply(2, 4.0f));
        System.out.println("Деление: " + Calculator.divide(10, 2L));
        System.out.println("Вычитание: " + Calculator.subtraction(7.5, 2));
    }
}
