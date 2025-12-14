package ПР9;

public class TestSortSl {
    public static void main(String[] args) {
        Students[] st1 = {new Students("Fazil",19,56),new Students("Vasif",19,48)};
        Students[] st2 = {new Students("Fazil",19,90),new Students("Vasif",19,40)};
        SortVstavk.sort(st1);
        for (int i = 0; i < st1.length;i++){
            System.out.println(st1[i].toString());
        }
        Students[] sort = SortSl.in_one(st1,st2);

        for (int i = 0; i < sort.length;i++){
            System.out.println(sort[i].toString());
        }
    }
}
