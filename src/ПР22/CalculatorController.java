package ПР22;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;
    private StringBuilder currentInput = new StringBuilder();
    private boolean newNumber = true;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        // Цифровые кнопки
        for (int i = 0; i < 10; i++) {
            final int num = i;
            view.getNumberButton(i).addActionListener(e -> onNumberClick(num));
        }

        // Операции
        view.getAddButton().addActionListener(e -> onOperationClick("+"));
        view.getSubButton().addActionListener(e -> onOperationClick("-"));
        view.getMulButton().addActionListener(e -> onOperationClick("*"));
        view.getDivButton().addActionListener(e -> onOperationClick("/"));

        // Точка
        view.getDotButton().addActionListener(e -> onDotClick());

        // Равно
        view.getEqualsButton().addActionListener(e -> onEqualsClick());

        updateDisplay();
    }

    private void onNumberClick(int num) {
        if (newNumber) {
            currentInput.setLength(0);
            newNumber = false;
        }
        currentInput.append(num);
        view.getDisplay().setText(currentInput.toString());
    }

    private void onDotClick() {
        if (newNumber) {
            currentInput.setLength(0);
            currentInput.append("0");
            newNumber = false;
        }
        if (!currentInput.toString().contains(".")) {
            currentInput.append(".");
            view.getDisplay().setText(currentInput.toString());
        }
    }

    private void onOperationClick(String op) {
        // Сначала добавляем текущее число в стек
        pushCurrentNumber();

        // Выполняем операцию
        try {
            model.performOperation(op);
            updateDisplay();
            newNumber = true;
        } catch (Exception e) {
            view.getDisplay().setText("Error: " + e.getMessage());
            newNumber = true;
        }
    }

    private void onEqualsClick() {
        // Просто добавляем число в стек (RPN-логика)
        pushCurrentNumber();
        updateDisplay();
        newNumber = true;
    }

    private void pushCurrentNumber() {
        if (currentInput.length() > 0) {
            try {
                double value = Double.parseDouble(currentInput.toString());
                model.push(value);
                currentInput.setLength(0);
            } catch (NumberFormatException e) {
                view.getDisplay().setText("Invalid number");
            }
        }
    }

    private void updateDisplay() {
        double result = model.getResult();
        if (result == (int) result) {
            view.getDisplay().setText(String.valueOf((int) result));
        } else {
            view.getDisplay().setText(String.valueOf(result));
        }
    }
}