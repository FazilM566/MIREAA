package ПР7;

public class Bookk implements Printable{
    String name;
    Printable[] printable;

    public Bookk(String name, Printable[] printable) {
        this.name = name;
        this.printable = printable;
    }

    @Override
    public void print() {
        System.out.println("название книги: " + name);
    }

    static public void printBooks(Printable[] printable) {
        for (int i = 0;i < printable.length;i++) {
            if (printable[i] instanceof Bookk){
                System.out.println(printable[i]);
            }
        }
    }
}
