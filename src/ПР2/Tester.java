package ПР2;

public class Tester {
    public static void main(String[] args) {
        Circle[] t = new Circle[2];
        int ln = t.length;
        Circle t1 = new Circle(new Point(1,2),new Point(2,4));
        Circle t2 = new Circle(new Point(4,3),new Point(7,5));
        t[0] = t1;
        t[1] = t2;
        for (int i = 0;i < ln;i++) {
            t[i].Prov();
        }
    }
}
