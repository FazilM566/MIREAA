package ПР12;
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.*;

public class Animation extends JFrame {
    private JLabel animationLabel;
    private ImageIcon[] frames;
    private Timer timer;
    private int currentFrame = 0;


    public Animation() {
        super("Анимация");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        animationLabel = new JLabel("", JLabel.CENTER);
        add(animationLabel);

        frames = new ImageIcon[6];
        for (int i = 0; i < 6; i++) {
            String path = "C:\\Users\\fazil\\Desktop\\Java\\MIREAA\\src\\ПР12\\girl_0" + (i + 1) + ".gif";
            frames[i] = new ImageIcon(path);
        }

        animationLabel.setIcon(frames[0]);

        try {
            String audioPath = "C:\\Users\\fazil\\Desktop\\Java\\MIREAA\\src\\ПР12\\Lana Del Rey - Summertime Sadness (online-audio-converter.com).wav";
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(audioPath));
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            e.printStackTrace();
        }

        timer = new Timer(100, e -> {
            currentFrame = (currentFrame + 1) % frames.length;
            animationLabel.setIcon(frames[currentFrame]);
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Animation().setVisible(true);
        });
    }
}