package ПР6;

public class MovableRectangle implements Movable{
    MovablePoint topLeft ;
    MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1,int x2,int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    public boolean prov() {
        if (this.topLeft.xSpeed == this.bottomRight.xSpeed && this.topLeft.ySpeed == this.bottomRight.ySpeed) {
            return true;
        }
        return false;
    }

    @Override
    public void moveUp() {
        if (prov()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
        else {
            System.out.println("Ошибка!");
        }
    }

    @Override
    public void moveDown() {
        if (prov()){
            topLeft.moveDown();
            bottomRight.moveDown();
        }
        else {
            System.out.println("Ошибка!");
        }

    }

    @Override
    public void moveLeft() {
        if (prov()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
        else {
            System.out.println("Ошибка!");
        }

    }

    @Override
    public void moveRight() {
        if (prov()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
        else {
            System.out.println("Ошибка!");
        }

    }

    @Override
    public String toString() {
        return "ПР6.MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
