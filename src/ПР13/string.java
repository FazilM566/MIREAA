package ПР13;

public class string {
    public static void main(String[] args) {
        string("I like Java!!!");
        person f = new person("","Melikov","G");
        f.FIO();
    }
    public static void string(String string){
        System.out.println(string.charAt(string.length()-1));
        System.out.println(string.endsWith("!!!"));
        System.out.println(string.startsWith("I like"));
        System.out.println(string.contains("Java"));
        System.out.println(string.indexOf("Java"));
        System.out.println(string.replace('a','o'));
        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());
        System.out.println(string.substring(string.indexOf("Java"),string.indexOf("!!!")));
    }
}
