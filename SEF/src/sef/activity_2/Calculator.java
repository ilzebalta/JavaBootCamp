package sef.activity_2;

public class Calculator {

    public static void main(String arg[]) {

        Calculator calculator = new Calculator();

        int a = 10;
        int b = 5;

        int result = calculator.add(a, b);
        System.out.println("Result of addition");
        System.out.println(result);
        System.out.println("-------");

        int result1 = calculator.substract(a, b);
        System.out.println("Result of substraction");
        System.out.println(result1);
        System.out.println("-------");

        int result2 = calculator.multiply(a, b);
        System.out.println("Result of multiplication");
        System.out.println(result2);
        System.out.println("-------");

        int result3 = calculator.divide(a, b);
        System.out.println("Result of division");
        System.out.println(result3);
        System.out.println("-------");

    }

    public int add (int a, int b) {
        int result = a + b;
        return result;
    }

    public int substract (int a, int b) {
        int result = a - b;
        return result;
    }

    public int multiply (int a, int b) {
        int result = a * b;
        return result;
    }

    public int divide (int a, int b) {
        int result = a/b;
        return result;
    }
}

