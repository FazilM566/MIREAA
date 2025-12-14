package ПР20;

import java.io.Serializable;

class Animal implements Serializable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}