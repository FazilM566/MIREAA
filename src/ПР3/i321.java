package ПР3;

public class i321 {
    public static void main(String[] args) {
        Double num  = Double.valueOf(1.5);
        System.out.println(num);
        String str = "1.34";
        System.out.println(Double.parseDouble(str));
        System.out.println(num.intValue());
        System.out.println(num.byteValue());
        System.out.println(num.shortValue());
        System.out.println(num.longValue());
        System.out.println(num.floatValue());
        System.out.println((char) num.intValue());
        String d = Double.toString(3.14);
        System.out.println(d);
    }
}
