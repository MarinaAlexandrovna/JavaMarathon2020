package day9.Task2;

public class Rectangle extends Figure {
    private double height;
    private double length;

    public Rectangle(String color, double height, double length) {
        super(color);
        this.height = height;
        this.length = length;
    }

    public Rectangle(double height, double length) {
        this.height = height;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double area() {
        double area;
        return area = height * length;
    }

    @Override
    public double perimeter() {
        double perimeter;
        return perimeter = (height+length)*2;
    }
}
