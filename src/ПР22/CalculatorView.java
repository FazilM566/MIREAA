package ПР22;

import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {
    private JTextField display;
    private JButton[] numberButtons = new JButton[10];
    private JButton addButton, subButton, mulButton, divButton, equalsButton;
    private JButton dotButton; // кнопка "."

    public CalculatorView() {
        setTitle("MyCalculator");
        setLayout(new BorderLayout());

        // Дисплей (верхняя строка)
        display = new JTextField("0");
        display.setFont(new Font("Arial", Font.BOLD, 28));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(display, BorderLayout.NORTH);

        // Панель кнопок
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Создаем кнопки
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = createButton(String.valueOf(i), Color.WHITE);
        }

        addButton = createButton("+", new Color(200, 230, 255));
        subButton = createButton("-", new Color(200, 230, 255));
        mulButton = createButton("*", new Color(200, 230, 255));
        divButton = createButton("/", new Color(200, 230, 255));
        equalsButton = createButton("=", new Color(200, 230, 255));
        dotButton = createButton(".", new Color(200, 230, 255)); // точка

        // Ряд 1: 7 8 9 /
        buttonPanel.add(numberButtons[7]);
        buttonPanel.add(numberButtons[8]);
        buttonPanel.add(numberButtons[9]);
        buttonPanel.add(divButton);

        // Ряд 2: 4 5 6 *
        buttonPanel.add(numberButtons[4]);
        buttonPanel.add(numberButtons[5]);
        buttonPanel.add(numberButtons[6]);
        buttonPanel.add(mulButton);

        // Ряд 3: 1 2 3 -
        buttonPanel.add(numberButtons[1]);
        buttonPanel.add(numberButtons[2]);
        buttonPanel.add(numberButtons[3]);
        buttonPanel.add(subButton);

        // Ряд 4: 0 . + =
        buttonPanel.add(numberButtons[0]);
        buttonPanel.add(dotButton);    // точка
        buttonPanel.add(addButton);    // кнопка "+"
        buttonPanel.add(equalsButton); // кнопка "="

        add(buttonPanel, BorderLayout.CENTER);

        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JButton createButton(String text, Color bgColor) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 20));
        button.setBackground(bgColor);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createRaisedBevelBorder());
        return button;
    }

    // Геттеры для кнопок
    public JButton getNumberButton(int i) { return numberButtons[i]; }
    public JButton getAddButton() { return addButton; }
    public JButton getSubButton() { return subButton; }
    public JButton getMulButton() { return mulButton; }
    public JButton getDivButton() { return divButton; }
    public JButton getEqualsButton() { return equalsButton; }
    public JButton getDotButton() { return dotButton; }
    public JTextField getDisplay() { return display; }
}