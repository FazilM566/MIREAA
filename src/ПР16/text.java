package ПР16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class text extends JFrame implements ItemListener{
    JTextArea jta1 = new JTextArea(10,25);
    String[] color = {
            "Синий",
            "Красный",
            "Черный"
    };
    JComboBox<String> cb = new JComboBox<>(color);
    String[] font = {
            "Times New Roman",
            "MS Sans Serif",
            "Courier New"
    };
    JComboBox<String> cb1 = new JComboBox<>(font);

    text(){
        super("Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setLayout(new FlowLayout());
        add(jta1);

        add(new JLabel("Цвет:"));
        add(cb);
        add(new JLabel("Шрифт:"));
        add(cb1);

        cb.addItemListener(this);
        cb1.addItemListener(this);

        setVisible(true);

    }

    public void itemStateChanged(ItemEvent e){
        if (e.getSource() == cb) {
            String selectedColor = (String) cb.getSelectedItem();
            switch (selectedColor) {
                case "Синий":
                    jta1.setForeground(Color.BLUE);
                    break;
                case "Красный":
                    jta1.setForeground(Color.RED);
                    break;
                case "Черный":
                    jta1.setForeground(Color.BLACK);
                    break;
            }
        }

        if (e.getSource() == cb1) {
            String selectedFont = (String) cb1.getSelectedItem();
            Font currentFont = jta1.getFont();
            jta1.setFont(new Font(selectedFont, currentFont.getStyle(), currentFont.getSize()));
        }

    }
    public static void main(String[] args){

        new text();
    }
}





