package ПР19;

public class TestINN {
    public static void main(String[] args) {
        Klient[] bs_klients = new Klient[4];
        String[] inns = {"123", "5001007П6259", "500100732259", "500100732258"};

        for (int i = 0; i < bs_klients.length; i++) {
            try {
                bs_klients[i] = new Klient("Melikov Fazil", inns[i]);
                System.out.println(bs_klients[i].toString());
            } catch (INN_Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}