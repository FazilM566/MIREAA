package ПР18;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try{
            Scanner myScanner = new Scanner( System.in);
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2.0/i );
        }
        catch (ArithmeticException e) {
            System.out.println("На 0 делить нельзя");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Неверно введенный аргумент(используйте целые числа)");
        }

    }
    public static void main(String[] args) {
        Exception2 obj = new Exception2();
        obj.exceptionDemo();
    }
}