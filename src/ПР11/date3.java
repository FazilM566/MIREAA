package ПР11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date3 {
    public static void main(String[] args) {

        Date date1 =new Date(1141534800L * 1000);
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Studentt studentt = new Studentt("Фазиль", "Меликов", "Информатика", 2, "КВБО 31-24", 20,date1);
        studentt.toString(formater);
    }
}
