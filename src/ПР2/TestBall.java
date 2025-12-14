package ПР2;

import java.util.Scanner;
public class TestBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ball ball = new Ball();
        System.out.println("Изначальное положение мяча " + ball.getX() + " " + ball.getY());
        System.out.println("В какую точку переместился мяч?");
        double xD = sc.nextDouble();
        double yD = sc.nextDouble();
        ball.setXY(xD,yD);
        System.out.println(ball.toString());
        System.out.println("На сколько переместился мяч (по X ,по Y) ?");
        double xxD = sc.nextDouble();
        double yyD = sc.nextDouble();
        ball.move(xxD,yyD);
        System.out.println(ball);
    }
}
