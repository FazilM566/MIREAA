package ПР17;

import javax.swing.*;
import java.awt.*;

public class AnimationView extends JFrame {
    private JLabel animationLabel;
    private JLabel nameLabel;
    private ImageIcon[] frames;
    private Timer timer;
    private int currentFrame = 0;

    public AnimationView() {
        super("Анимация с паттерном MVC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 450); // Увеличили высоту для имени
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());


        nameLabel = new JLabel("", JLabel.CENTER);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        nameLabel.setForeground(Color.BLUE);
        add(nameLabel, BorderLayout.NORTH);


        animationLabel = new JLabel("", JLabel.CENTER);
        add(animationLabel, BorderLayout.CENTER);
    }


    public void setName(String name) {
        nameLabel.setText("Имя: " + name);
    }

    public void setFrames(ImageIcon[] frames) {
        this.frames = frames;
        if (frames != null && frames.length > 0) {
            animationLabel.setIcon(frames[0]);
        }
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public void setCurrentFrame(int frameIndex) {
        if (frames != null && frameIndex >= 0 && frameIndex < frames.length) {
            animationLabel.setIcon(frames[frameIndex]);
        }
    }

    public void startAnimation() {
        if (timer != null) {
            timer.start();
        }
    }
}