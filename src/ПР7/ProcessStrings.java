package ПР7;

public class ProcessStrings implements Strings{
    String string;

    public ProcessStrings(String string) {
        this.string = string;
    }

    public int count() {
        return string.length();
    }

    public void uneven() {
        char[] str = string.toCharArray();
        for (int i = 0;i < str.length;i+=2){
            System.out.print(str[i]);
        }
        System.out.println();

    }

    public void inventorying() {
        char[] str = string.toCharArray();
        for (int i = str.length - 1;i > -1;i--){
            System.out.print(str[i]);
        }
    }
}
