package ПР4;

public class FurnitureShop {
    furniture[] fr;
    int all_price;
    int count;

    public FurnitureShop(furniture[] fr, int all_price,int count) {
        this.fr = fr;
        this.all_price = all_price;
        this.count = count;
    }

    public int getAll_price() {
        return all_price;
    }

    public void Add(furniture nw) {
        furniture[] ncomp = new furniture[count+1];
        for (int i = 0;i < count;i++) {
            ncomp[i] = fr[i];
        }
        ncomp[count] = nw;
        fr = ncomp;
        count +=1;
    }

    public void Delete(furniture k) {
        furniture[] nncomp = new furniture[count-1];
        for (int i = 0;i < count;i++) {
            if (fr[i]==k) {
                fr[i] = fr[count-1];
                break;
            }
        }
        for (int i = 0;i < count-1;i++) {
            nncomp[i] = fr[i];
        }
        fr = nncomp;
        count-=1;
    }

    public void Search (furniture x){
        boolean j = false;
        for (int i = 0;i < count;i++) {
            if (fr[i] == x){
                j = true;
                break;
            }
            else  {
                j = false;
            }
        }
        if (j == true) {
            System.out.println(x + " есть в магазине");
        }
        else {
            System.out.println(x + " нет в магазине");
        }
    }
    public int remains(){
        int pr = 0;
        for (int i = 0;i < fr.length;i++) {
           pr+=fr[i].getPrice();
        }
        return pr;
    }
    public void String () {
        for (int i = 0;i < count;i++) {
            System.out.println(fr[i].toString());
        }
    }
}
