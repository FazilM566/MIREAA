package ПР4;

public class Pupil {
    String name;
    String educational;

    public Pupil(String name, String educational) {
        this.name = name;
        this.educational = educational;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducational() {
        return educational;
    }

    public void setEducational(String educational) {
        this.educational = educational;
    }

    @Override
    public String toString() {
        return
                "Меня зовут " + name  +
                " ,я учусь в " + educational  ;
    }
}
