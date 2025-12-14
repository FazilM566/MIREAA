package ПР6;

import java.io.Serializable;

public class Animal implements Nameable {
    String animal_name;

    public Animal(String animal_name) {
        this.animal_name = animal_name;
    }

    public void getName() {
        System.out.println("Название животного "+ animal_name);
    }

}
