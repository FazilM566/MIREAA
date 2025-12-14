package ПР2;

public class Shop {

    public int r;
    public Comp[] comp;
    public Shop (int r,Comp[] comp) {
        this.r = r;
        this.comp = comp;
    }

    public void Add(Comp nw) {
        Comp[] ncomp = new Comp[r+1];
        for (int i = 0;i < r;i++) {
            ncomp[i] = comp[i];
        }
        ncomp[r] = nw;
        comp = ncomp;
        r +=1;
    }

    public void Delete(Comp k) {
        Comp[] nncomp = new Comp[r-1];
        for (int i = 0;i < r;i++) {
            if (comp[i]==k) {
                comp[i] = comp[r-1];
                break;
            }
        }
        for (int i = 0;i < r-1;i++) {
            nncomp[i] = comp[i];
        }
        comp = nncomp;
        r-=1;
    }

    public void Search (Comp x){
        boolean j = false;
        for (int i = 0;i < r;i++) {
            if (comp[i] == x){
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

    public void String () {
        for (int i = 0;i < r;i++) {
            System.out.println(comp[i]);
        }
    }
}
