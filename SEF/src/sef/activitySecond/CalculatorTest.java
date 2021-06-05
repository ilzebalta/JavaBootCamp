package sef.activitySecond;

import junit.framework.TestCase;


public class CalculatorTest extends TestCase {

    protected Calculator calculator;

    protected void setUp() {
        calculator = new Calculator();
    }

    public void testAdd() {
        int a = 10;
        int b = 5;

        assertEquals(15, calculator.add(a, b));
    }

    public void testSubstract() {
        int a = 10;
        int b = 5;

        assertEquals(5, calculator.substract(a, b));
    }

    public void testMultiply() {
        int a = 10;
        int b = 5;

        assertEquals(50, calculator.multiply(a, b));
    }

    public void testDivide() {
        int a = 10;
        int b = 5;

        assertEquals(2, calculator.divide(a,b));
    }
}