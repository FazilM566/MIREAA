package ПР4;

public class PupilTest {
    public static void main(String[] args) {
        Schoolboy p1 = new Schoolboy(9,"Amina","Derg23");
        Student p2 =  new Student(2,4,"Fazil","MIREA");
        Schoolboy p3 = new Schoolboy(2,"Vasif","Ram21");
        Student p4  = new Student(2,4,"Mina","GUP");
        Pupil[] alls = {p1,p2,p3,p4};
        System.out.println("Студенты: ");
        for (int i = 0;i < alls.length;i++) {
            if (alls[i] instanceof Student) {
                System.out.println(alls[i]);
                System.out.println("Я окончу ВУЗ через " + ((Student) alls[i]).remains() + " курса");
            }
        }
        System.out.println("Школьники: ");
        for (int i = 0;i < alls.length;i++) {
            if (alls[i] instanceof Schoolboy) {
                System.out.println(alls[i]);
                System.out.println("у меня ЕГЭ через " + ((Schoolboy) alls[i]).distance() + " лет");
            }
        }
    }
}
