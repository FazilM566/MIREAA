package ПР13;

public class Shirt {
    String shirt;
    String art;
    String name;
    String color;
    String size;

    public Shirt(String shirt) {
        this.shirt = shirt;
        this.art = shirt.split(",")[0];
        this.name = shirt.split(",")[1];
        this.color = shirt.split(",")[2];
        this.size = shirt.split(",")[3];
    }

    @Override
    public String toString() {
        return "ПР13.Shirt{" +
                "art='" + art + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo ПР13.Shirt,Black,XL";
        shirts[1] = "S002,Black Polo ПР13.Shirt,Black,L";
        shirts[2] = "S003,Blue Polo ПР13.Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo ПР13.Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo ПР13.Shirt,Tan,XL";
        shirts[5] = "S006,Black T-ПР13.Shirt,Black,XL";
        shirts[6] = "S007,White TShirt,White,XL";
        shirts[7] = "S008,White T-ПР13.Shirt,White,L";
        shirts[8] = "S009,Green T-ПР13.Shirt,Green,S";
        shirts[9] = "S010,Orange T-ПР13.Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo ПР13.Shirt,Maroon,S";
        Shirt[] shirts1 = new Shirt[11];

        for (int i = 0;i < shirts.length ;i ++) {
            shirts1[i] = new Shirt(shirts[i]);
        }

        for (int i = 0;i < shirts1.length ;i ++){
            System.out.println(shirts1[i]);
        }

    }
}
