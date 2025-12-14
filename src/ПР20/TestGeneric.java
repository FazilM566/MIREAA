package ПР20;

public class TestGeneric {
    public static void main(String[] args) {

        Animal animal = new Animal("Барсик");


        Generic<String, Animal, Integer> obj = new Generic<>("Привет", animal, 123);


        System.out.println("Классы:");
        obj.out_class();
    }
}