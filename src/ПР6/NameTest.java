package ПР6;

public class NameTest {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Медведь");
        Animal animal2 = new Animal("Тигр");
        Car car1 = new Car("Tesla","Белый");
        Car car2 = new Car("BMW","Черный");
        Planet planet1 = new Planet("Земля","Млечный путь");
        Planet planet2 = new Planet("Гончие псы","TON 618");
        Nameable[] list = {car1,car2,animal1,animal2,planet1,planet2};
        for (int i = 0;i < list.length;i++) {
            list[i].getName();
        }

    }





}
