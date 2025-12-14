package ПР6;

public class Car implements Nameable {
    String title;
    String color;

    public Car(String title,String color) {
        this.title = title;
        this.color = color;
    }

    public void getName(){
        System.out.println("Название " + title + " цвет " + color);
    }
}
