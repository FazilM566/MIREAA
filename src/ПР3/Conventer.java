package ПР3;

import java.text.NumberFormat;
import java.util.Locale;
public class Conventer {
    double dn;
    String coun;
    public Conventer(double dn, String coun) {
        this.dn = dn;
        this.coun = coun;
    }
    public double getDn() {
        return dn;
    }
    public void setDn(double dn) {
        this.dn = dn;
    }
    public String getCoun() {
        return coun;
    }
    public void setCoun(String coun) {
        this.coun = coun;
    }
    public void format() {
        if (coun.equals("France")) {
            dn *= 0.8513;
            NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            System.out.println("Денежная единица во французской локали: " + numberFormat4.format(dn));
        }
        if (coun.equals("China")) {
            dn *= 7.12;
            NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.CHINA);
            System.out.println("Денежная единица в китайской локали: " + numberFormat4.format(dn));
        }
        if (coun.equals("Korea")) {
            dn *= 1400.27;
            NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.KOREA);
            System.out.println("Денежная единица в японской локали: " + numberFormat4.format(dn));
        }
    }
}
