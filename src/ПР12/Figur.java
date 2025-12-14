package ПР12;

import ПР2.Point;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Figur extends JFrame {
    private ArrayList<Shape> shapes;
    private Random random;

    public Figur() {
        super("20 Random Shapes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        shapes = new ArrayList<>();
        random = new Random();

        createRandomShapes(20);
    }

    private void createRandomShapes(int count) {
        for (int i = 0; i < count; i++) {
            // Случайная позиция
            Point position = new Point(random.nextInt(700), random.nextInt(500));

            // Случайный цвет
            String color = String.format("#%06x", random.nextInt(0xFFFFFF));

            // Случайный выбор типа фигуры (0 или 1)
            int shapeType = random.nextInt(2);

            switch (shapeType) {
                case 0: // Прямоугольник
                    shapes.add(new Rect(position, color, 30 + random.nextInt(100), 30 + random.nextInt(100)));
                    break;
                case 1: // Овал
                    shapes.add(new Oval(position, color, 30 + random.nextInt(100), 30 + random.nextInt(100)));
                    break;
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (Shape shape : shapes) {
            try {
                Color color = Color.decode(shape.getColor());
                g.setColor(color);
            } catch (NumberFormatException e) {
                g.setColor(Color.BLACK);
            }

            Point position = shape.getPosition();

            if (shape instanceof Rect) {
                Rect rect = (Rect) shape;
                g.fillRect(position.getX(), position.getY(), rect.getWidth(), rect.getHeight());
            }
            else if (shape instanceof Oval) {
                Oval oval = (Oval) shape;
                g.fillOval(position.getX(), position.getY(), oval.getWidth(), oval.getHeight());
            }
        }
    }

    public static void main(String[] args) {
        new Figur().setVisible(true);
    }
}