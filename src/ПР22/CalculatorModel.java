package ПР22;

import java.util.Stack;

public class CalculatorModel {
    private Stack<Double> stack = new Stack<>();

    // Поместить число в стек
    public void push(double value) {
        stack.push(value);
    }

    // Выполнить операцию над двумя верхними числами
    public void performOperation(String op) throws Exception {
        if (stack.size() < 2) {
            throw new Exception("Недостаточно чисел");
        }
        double b = stack.pop();
        double a = stack.pop();
        double result = 0;

        switch (op) {
            case "+": result = a + b; break;
            case "-": result = a - b; break;
            case "*": result = a * b; break;
            case "/":
                if (b == 0) throw new Exception("Деление на ноль");
                result = a / b;
                break;
            default: throw new Exception("Неизвестная операция");
        }

        stack.push(result);
    }

    // Получить результат (верхнее число стека)
    public double getResult() {
        return stack.isEmpty() ? 0 : stack.peek();
    }

    // Очистить стек
    public void clear() {
        stack.clear();
    }

    // Получить состояние стека (для отладки)
    public Stack<Double> getStack() {
        return stack;
    }
}