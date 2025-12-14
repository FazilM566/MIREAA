package ПР19;

public class Klient {
    String FIO;
    String INN;

    public Klient(String FIO, String INN) throws INN_Exception{
        this.FIO = FIO;
        this.INN = INN;
        if (INN.length() != 12) throw new INN_Exception("Недостаточная длинна(12 символов)");
        if (!INN.matches("\\d+")) throw new INN_Exception("Неверно введеные символы, используйте только цифры");
        if (error(INN)) throw new INN_Exception("ИНН недействителен(перепроверьте последние две цифры записи)");


    }
    public static boolean error(String inn) {
        if (inn == null || !inn.matches("\\d{12}")) return false;

        int[] coefficients1 = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int[] coefficients2 = {3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8};


        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (inn.charAt(i) - '0') * coefficients1[i];
        }
        int check1 = sum % 11;
        if (check1 == 10) check1 = 0;
        if (check1 != inn.charAt(10) - '0') return false;


        sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += (inn.charAt(i) - '0') * coefficients2[i];
        }
        int check2 = sum % 11;
        if (check2 == 10) check2 = 0;

        return check2 == inn.charAt(11) - '0';
    }



    @Override
    public String toString() {
        return "ПР19.Klient{" +
                "FIO='" + FIO + '\'' +
                ", INN='" + INN + '\'' +
                '}';
    }
}
