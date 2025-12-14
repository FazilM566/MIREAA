package ПР4;

abstract public class furniture {
    String color;
    int height;
    int width;
    int length;
    int price;

    public furniture(String color, int height, int width, int length,int price) {
        this.color = color;
        this.height = height;
        this.width = width;
        this.length = length;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ПР4.furniture{" +
                "color='" + color + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", length=" + length +
                ", price=" + price +
                '}';
    }
}
