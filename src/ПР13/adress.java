package ПР13;

import java.util.StringTokenizer;
public class adress {
    String adress;
    String country;
    String region;
    String city;
    String street;
    String number_house;
    String number_building;
    String number_flat;

    public adress(String adress) {
        this.adress = adress;
        String[] parts = adress.split(",");
        if (parts.length < 7) {
            System.out.println("Ошибка: Недостаточно элементов в адресе");
            return;
        }
        this.country = parts[0].trim();
        this.region = parts[1].trim();
        this.city = parts[2].trim();
        this.street = parts[3].trim();
        this.number_house = parts[4].trim();
        this.number_building = parts[5].trim();
        this.number_flat = parts[6].trim();
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number_house='" + number_house + '\'' +
                ", number_building='" + number_building + '\'' +
                ", number_flat='" + number_flat + '\'' +
                '}';
    }
    public void str2() {
        StringTokenizer st = new StringTokenizer(adress, ",.;");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken().trim());
        }
    }

    public static void main(String[] args) {
        adress adr = new adress("Russia, msk, Rama, derg, 34, 3, 118");
        adress adr1 = new adress("USA,California,Los Angeles,Hollywood,123,1,45");
        adress adr2 = new adress("Germany,Berlin,Berlin,ПР22.Main str,67,,12");
        adress adr3 = new adress("France, Provence, Marseille, Old Port, 15, B, 28");
        System.out.println(adr);
        adr1.str2();
        adr2.str2();
        System.out.println(adr3);
    }

}
