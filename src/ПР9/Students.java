package ПР9;

public class Students {
    String name;
    int age;
    int iD;

    public Students(String name, int age, int iD) {
        this.name = name;
        this.age = age;
        this.iD = iD;
    }

    public int getiD() {
        return iD;
    }

    @Override
    public String toString() {
        return "ПР9.Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", iD=" + iD +
                '}';
    }
}
