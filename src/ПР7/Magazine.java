package ПР7;

public class Magazine implements Printable{
    String name;
    Printable[] printable;

    public Magazine(String name, Printable[] printable) {
        this.name = name;
        this.printable = printable;
    }

    @Override
    public void print() {
        System.out.println("название журнала: " + name);
    }

    static public void printMagazines(Printable[] printable) {
        for (int i = 0;i < printable.length;i++) {
            if (printable[i] instanceof Magazine){
                System.out.println(printable[i]);
            }
        }
    }
}
