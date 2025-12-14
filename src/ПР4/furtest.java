package ПР4;

public class furtest {
    public static void main(String[] args) {
        furniture ch1 = new chair("green",20,12,10,5000,"stool");
        furniture ch2 = new chair("blue",12,30,5,7000,"couch");
        furniture wr1 = new wardrobe("white",100,20,50,"pine_tree",25000);
        furniture wr2 = new wardrobe("white",90,31,41,"fir",50000);
        furniture[] frr = {ch1,ch2,wr1,wr2};
        FurnitureShop fSh = new FurnitureShop(frr,100000,4);
        fSh.String();
        System.out.println("Сумма закупки: " + fSh.remains());
        System.out.println("Остаток: " + (fSh.getAll_price() - fSh.remains()));
        furniture ch3 = new chair("black",10,6,3,10000,"stool");
        fSh.Add(ch3);
        fSh.String();
        System.out.println("Сумма закупки: " + fSh.remains());
        System.out.println("Остаток: " + (fSh.getAll_price() - fSh.remains()));
    }
}
