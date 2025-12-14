package ПР6;

public class Book implements Priceable{
    int price;

    public Book(int price) {
        this.price = price;
    }
    public void getPrice(){
        System.out.println("Цена книги: " + price);
    }
}
