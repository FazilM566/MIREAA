package ПР5;

import javax.swing.*;
public class img {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Food");
        JLabel label = new JLabel(new ImageIcon(args[0]));
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.pack();
        frame.setVisible(true);

    }
}
