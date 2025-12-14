package ПР6;

class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        System.out.println(ySpeed);

    }

    @Override
    public void moveDown() {
        System.out.println(-ySpeed);

    }

    @Override
    public void moveLeft() {
        System.out.println(-xSpeed);

    }

    @Override
    public void moveRight() {
        System.out.println(xSpeed);

    }

    @Override
    public String toString() {
        return "ПР6.MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
