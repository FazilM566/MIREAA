package ПР12;

import ПР2.Point;

public class Rect extends Shape{
    int width;
    int height;

    public Rect(Point position, String color, int width, int height) {
        super(position, color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
