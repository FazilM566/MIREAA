package ПР6;

public class Table implements Priceable{
    int price;
    String color;

    public Table(int price, String color) {
        this.price = price;
        this.color = color;
    }
    public void getPrice() {
        System.out.println("Цвет стула: " + color + " цена-" + price);
    }
}
