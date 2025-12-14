package ПР17;

import javax.swing.*;

public class Pattern {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            Girl model1 = new Girl("Амина", "Lana Del Rey - Summertime Sadness"); //Adele - Hello также можно написать

            AnimationView view1 = new AnimationView();

            AnimationController controller1 = new AnimationController(model1, view1);

            controller1.startAnimation();

            view1.setVisible(true);


        });
    }
}