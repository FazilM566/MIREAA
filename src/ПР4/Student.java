package ПР4;

public class Student extends Pupil {
    int kyrs;
    int end_kyrs;
    public Student(int kyrs ,int end_kyrs,String name,String educational) {
        super(name, educational);
        this.kyrs = kyrs;
        this.end_kyrs = end_kyrs;
    }

    public int getKyrs() {
        return kyrs;
    }

    public void setKyrs(int kyrs) {
        this.kyrs = kyrs;
    }

    public int getEnd_kyrs() {
        return end_kyrs;
    }

    public void setEnd_kyrs(int end_kyrs) {
        this.end_kyrs = end_kyrs;
    }

    public int remains(){
        return end_kyrs - kyrs + 1;
    }
}
