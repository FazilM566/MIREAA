package ПР6;

public class Phone implements Priceable{
    int price;
    String model;

    public Phone(int price, String model) {
        this.price = price;
        this.model = model;
    }
    public void getPrice(){
        System.out.println("Модель телефона: " + model + " цена-" + price);
    }
}
