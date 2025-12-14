package ПР12;

import ПР2.Point;

public abstract class Shape {
    String color;
    Point position;

    public Shape(Point position, String color) {
        this.position = position;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
}
