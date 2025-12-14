package ПР2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Fazil","melikovfazil2424",'M');
        System.out.println(a.toString());
        a.setEmail("melikovfazil2445");
        System.out.print(a.toString());
    }
}
