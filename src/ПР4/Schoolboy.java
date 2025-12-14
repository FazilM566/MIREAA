package ПР4;

class Schoolboy extends Pupil {
    int clas;
    public Schoolboy(int clas,String name,String educational) {
        super(name, educational);
        this.clas = clas;
    }

    public int getClas() {
        return clas;
    }

    public void setClas(int clas) {
        this.clas = clas;
    }

    public int distance(){
        return 11 - clas;
    }
}
