package ПР13;

public class person {
    String name;
    String surname;
    String patronymic;

    public person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public void FIO(){
        StringBuilder result = new StringBuilder(surname);

        if (!name.isEmpty()) {
            result.append(" ").append(name.charAt(0)).append(".");
        }

        if (!patronymic.isEmpty()) {
            result.append(" ").append(patronymic.charAt(0)).append(".");
        }

        System.out.println(result);
    }
    public static void main(String[] args) {
        person f = new person("","Melikov","G");
        f.FIO();
    }

}
