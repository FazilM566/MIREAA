package ПР13;

public class Nomber {
    String nomber;

    public Nomber(String nomber) {
        this.nomber = nomber;
    }

    public void string(){
        if(nomber.length()==11) {
            System.out.println("+" + nomber.substring(0,1) + nomber.substring(1,4) + "-" + nomber.substring(4,7) + "-" + nomber.substring(7,11));
        }
        else{
            System.out.println(nomber.substring(0,nomber.length()-10) + nomber.substring(nomber.length()-10,nomber.length()-7) + "-" + nomber.substring(nomber.length()-7,nomber.length()-4) + "-" + nomber.substring(nomber.length()-4,nomber.length()));
        }
    }

    public static void main(String[] args) {
        Nomber nb = new Nomber("+109267036617");
        Nomber nb1 = new Nomber("89267036617");
        nb.string();
        nb1.string();;
    }
}
