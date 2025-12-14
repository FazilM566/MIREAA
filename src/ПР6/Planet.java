package ПР6;

public class Planet implements Nameable {
    String title;
    String title_galaxy;

    public Planet(String title, String title_galaxy) {
        this.title = title;
        this.title_galaxy = title_galaxy;
    }

    public void getName(){
        System.out.println("Галактика " + title + " планета " + title_galaxy);

    }
}
