package sef.module6.activity;

public class Rectangle extends Shape {
    private double lenght;
    private double breadth;

    public Rectangle() {
    }

    public Rectangle(double lenght, double breadth) {
        this.lenght = lenght;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        double area = lenght * breadth;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = (lenght + breadth) * 2;
        return perimeter;
    }
}
