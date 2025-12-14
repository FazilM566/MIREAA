package ПР171;

public class Student3 {
    String name;
    int age;
    Student3 next;  // ссылка на следующего студента

    public Student3(String name, int age) {
        this.name = name;
        this.age = age;
        this.next = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ПР171.Student3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student3 student3 = (Student3) o;
        return age == student3.age &&
                name != null && name.equals(student3.name);
    }


}