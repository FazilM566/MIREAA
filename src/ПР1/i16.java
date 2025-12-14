package ПР1;

public class i16 {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println( i+ 1 + "й член гармонического ряда равен " + 1.0 / (i + 1));
            i+=1;
        } while (i < 10);
    }
}
