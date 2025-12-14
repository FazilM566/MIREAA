package ПР24;

public class TestComplexFactory {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex defaultComplex = factory.createComplex();
        Complex customComplex = factory.createComplex(3, 4);

        System.out.println("Default ПР24.Complex: " + defaultComplex);
        System.out.println("Custom ПР24.Complex: " + customComplex);
    }
}