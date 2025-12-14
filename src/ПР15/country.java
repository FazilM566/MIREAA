package ПР15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class country extends JFrame {

    String[] items = {
            "Австралия",
            "Китай",
            "Англия"
    };
    JComboBox editComboBox = new JComboBox<>(items);

    country() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(editComboBox);

        editComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if ("Китай".equals(editComboBox.getSelectedItem())) {
                    JOptionPane.showMessageDialog(null, "Население: 1 415 667 819 человек " +
                            "Площадь: 9,6 млн кв. км. " + "Столица: Пекин", "Результат", JOptionPane.INFORMATION_MESSAGE);
                }
                // Можно добавить обработку других стран
                else if ("Австралия".equals(editComboBox.getSelectedItem())) {
                    JOptionPane.showMessageDialog(null, "Население: 27 039 239 человек" +
                            "Площадь: 7 692 024 км² " + "Столица: Австралиа", "Результат", JOptionPane.INFORMATION_MESSAGE);
                }
                else if ("Англия".equals(editComboBox.getSelectedItem())) {
                    JOptionPane.showMessageDialog(null, "Население: 70 246 633 человека " +
                            "Площадь: 130 395 км²" + "Столица: Лондон", "Результат", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args){

        new country();
    }
}