package ПР5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class football {
    private static int milanScore = 0;
    private static int madridScore = 0;
    private static JLabel label1;
    private static JLabel label2;
    private static JLabel label3;
    private static void updateLabels(String lastScorer) {
        label1.setText("Result: " + milanScore + " X " + madridScore);
        label2.setText("Last Scorer: " + lastScorer);
        String winner;
        if (milanScore > madridScore) {
            winner = "AC Milan";
        } else if (madridScore > milanScore) {
            winner = "Real Madrid";
        } else {
            winner = "DRAW";
        }
        label3.setText("Winner: " + winner);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mutch");
        JPanel panel= new JPanel();
        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");
        label1 = new JLabel("Result: 0 X 0", JLabel.CENTER);
        label2 = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        label3 = new JLabel("Winner: DRAW", JLabel.CENTER);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateLabels("AC Milan");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateLabels("Real Madrid");
            }
        });
        frame.setLayout(new java.awt.FlowLayout());
        panel.setBackground(Color.GREEN);
        panel.setPreferredSize( new Dimension(200,300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
        panel.add(button1);
        panel.add(button2);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
