package sef.module6.activity;

public class AbstractionActivity {

    public static void main(String[] args) {
        Shape p1 = new Square(5);
        p1.setColor("red");

        System.out.println("*** Print the information for square");
        System.out.println("Color of square: " + p1.getColor());
        System.out.println("Area of square: " + p1.calculateArea());
        System.out.println("Perimeter of square: " + p1.calculatePerimeter());
        System.out.println();

        Shape p2= new Rectangle(5,6);
        p2.setColor("green");

        System.out.println("*** Print the information for rectangle");
        System.out.println("Color of rectangle: " + p2.getColor());
        System.out.println("Area of rectangle: " + p2.calculateArea());
        System.out.println("Perimeter of rectangle: " + p2.calculatePerimeter());
    }
}