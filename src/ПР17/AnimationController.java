package ПР17;

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class AnimationController {
    private Girl model;
    private AnimationView view;
    private Timer timer;
    private int currentFrame = 0;
    private Clip audioClip;

    public AnimationController(Girl model, AnimationView view) {
        this.model = model;
        this.view = view;
        initController();
    }

    private void initController() {

        view.setName(model.getName());


        ImageIcon[] frames = new ImageIcon[6];
        for (int i = 0; i < 6; i++) {
            String path = "C:\\Users\\fazil\\Desktop\\Java\\MIREAA\\src\\ПР12\\girl_0" + (i + 1) + ".gif";
            frames[i] = new ImageIcon(path);
        }
        view.setFrames(frames);


        try {

            String audioPath = "C:\\Users\\fazil\\Desktop\\Java\\MIREAA\\src\\ПР12\\" + model.getFavoriteSong() + " (online-audio-converter.com).wav";
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(audioPath));
            audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);
            audioClip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            e.printStackTrace();
        }


        timer = new Timer(100, e -> {
            currentFrame = (currentFrame + 1) % frames.length;
            view.setCurrentFrame(currentFrame);
        });
        view.setTimer(timer);
    }

    public void startAnimation() {
        view.startAnimation();
        if (audioClip != null) {
            audioClip.start();
        }
    }


    public void updateGirl(String name, String favoriteSong) {
        model.setName(name);
        model.setFavoriteSong(favoriteSong);
        view.setName(name);
    }
}