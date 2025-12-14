package ПР6;

public class TestPrice {
    public static void main(String[] args) {
        Table table1 = new Table(2000,"green");
        Table table2 = new Table(20000,"white");
        Book book = new Book(1000);
        Phone phone1 = new Phone(150000,"Iphone");
        Phone phone2 = new Phone(15000,"Sumsung");
        Priceable[] list = {table1,table2,book,phone2,phone1};
        for (int i = 0;i < list.length;i++) {
            list[i].getPrice();
        }

    }
}
