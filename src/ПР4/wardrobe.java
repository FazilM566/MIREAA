package ПР4;

public class wardrobe extends furniture{
    String type_tree;

    public wardrobe(String color, int height, int width, int length, String type_tree,int price) {
        super(color, height, width, length,price);
        this.type_tree = type_tree;
    }


    @Override
    public String toString() {
        return "ПР4.wardrobe{" +
                "type_tree='" + type_tree + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", length=" + length +
                ", price=" + price +
                '}';
    }
}
