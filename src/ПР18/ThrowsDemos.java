package ПР18;

import java.util.Scanner;

public class ThrowsDemos {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        try {
            String key = myScanner.nextLine();
            printDetails(key);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }


    public static void main(String[] args) {
        ThrowsDemos demo = new ThrowsDemos();
        demo.getKey();
    }
}