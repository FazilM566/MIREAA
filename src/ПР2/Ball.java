package ПР2;

public class Ball {
    public double x = 0.0;
    public double y = 0.0;
    public Ball(double x,double y) {
        this.y = y;
        this.x = x;
    }
    public Ball() {
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x,double y) {
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp,double yDisp) {
        x+=xDisp;
        y+=yDisp;
    }
    @Override
    public String toString() {
        return "ПР2.Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
