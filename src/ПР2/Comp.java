package ПР2;

public class Comp {
    public String name;
    public int model;
    public String colour;
    public Comp (String name,int model,String colour) {
        this.name = name;
        this.model = model;
        this.colour = colour;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getModel() {
        return model;
    }
    public void setModel(int model) {
        this.model = model;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    @Override
    public String toString() {
        return "ПР2.Comp{" +
                "name=" + name +
                ", model=" + model +
                ", colour=" + colour +
                '}';
    }
}
