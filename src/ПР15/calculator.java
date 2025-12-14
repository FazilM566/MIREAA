package ПР15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class calculator extends JFrame{
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button1 = new JButton("+");
    JButton button2 = new JButton("-");
    JButton button3 = new JButton("*");
    JButton button4 = new JButton("/");


    calculator(){
        super("Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(250,150);
        add(new JLabel("1st Number"));
        add(jta1);
        add(new JLabel("2nd Number"));
        add(jta2);
        add(button1);
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result ="
                            + (x1+x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ошибка: Введите корректные числа!", "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);

        add(button2);
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result ="
                            + (x1-x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ошибка: Введите корректные числа!", "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);

        add(button3);
        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result ="
                            + (x1*x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ошибка: Введите корректные числа!", "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);

        add(button4);
        button4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    if (x2 == 0) {
                        JOptionPane.showMessageDialog(null, "Ошибка: Деление на ноль невозможно!", "Ошибка", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Result ="
                                + (x1/x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ошибка: Введите корректные числа!", "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
    }
    public static void main(String[] args){
        new calculator();
    }
}