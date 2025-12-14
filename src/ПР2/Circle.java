package ПР2;

public class Circle {
    public Point o;
    public Point tch;
    public Circle(Point o,Point tch) {
        this.o = o;
        this.tch = tch;
    }
    public void Prov() {
        System.out.println("Ваша точка лежит на окружности с центром " + o.getX() +  " "+ o.getY()+ " с радиусом равным: "
                + Math.sqrt(Math.pow((tch.getX() - o.getX()),2)  + Math.pow((tch.getY() - o.getY()),2)));
    }
}
