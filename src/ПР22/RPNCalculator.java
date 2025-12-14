package ПР22;

import java.util.Stack;
import java.util.Scanner;

public class RPNCalculator {

    // Метод для вычисления выражения в обратной польской нотации
    public static double evaluateRPN(String expression) {
        Stack<Double> stack = new Stack<>();
        Scanner scanner = new Scanner(expression);

        while (scanner.hasNext()) {
            String token = scanner.next();

            if (isNumber(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Недостаточно операндов для операции: " + token);
                }
                double b = stack.pop();
                double a = stack.pop();
                double result = applyOperator(token, a, b);
                stack.push(result);
            }
        }

        scanner.close();

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Некорректное выражение: в стеке осталось более одного значения");
        }

        return stack.pop();
    }


    private static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    private static double applyOperator(String operator, double a, double b) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Деление на ноль");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Неизвестный оператор: " + operator);
        }
    }


    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Введите выражение в обратной польской нотации (числа и операторы через пробел):");
        String expression = inputScanner.nextLine();

        try {
            double result = evaluateRPN(expression);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        inputScanner.close();
    }
}