package day9.Task2;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        double area;
        return area = (Math.round(Math.PI * Math.pow(radius, 2)));
    }

    @Override
    public double perimeter() {
        double perimeter;
        return perimeter = 2 * Math.PI * radius;
    }
}
