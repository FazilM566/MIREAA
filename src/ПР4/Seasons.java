package ПР4;

enum Seasons {
    WINTER (-5),
    SPRING (10),
    SUMMER (20),
    AUTUMN (7);
    private int temp;
    public String description = "Холодное время года";
    Seasons(int temp){
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription() {
        this.description = "Теплое время года";
    }

}
