package ПР18;

public class Exception1 {
    public void exceptionDemo() {
        try{
            System.out.println(2 / 0);
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
        finally{

            System.out.println("Конец!");
        }
    }

    public static void main(String[] args) {
        Exception1 obj = new Exception1();
        obj.exceptionDemo();
    }
}
