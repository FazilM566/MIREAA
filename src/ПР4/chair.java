package ПР4;

public class chair extends furniture{
    String type;

    public chair(String color, int height, int width, int length, int price, String type) {
        super(color, height, width, length, price);
        this.type = type;
    }


    @Override
    public String toString() {
        return "ПР4.chair{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", length=" + length +
                ", price=" + price +
                '}';
    }
}
