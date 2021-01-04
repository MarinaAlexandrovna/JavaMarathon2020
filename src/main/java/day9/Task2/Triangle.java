package day9.Task2;

public class Triangle extends Figure {
    private double lengthA;
    private double lengthB;
    private double lengthC;

    public Triangle(String color, double lengthA, double lengthB, double lengthC) {
        super(color);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    public Triangle(double lengthA, double lengthB, double lengthC) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    public double getLengthA() {
        return lengthA;
    }

    public double getLengthB() {
        return lengthB;
    }

    public double getLengthc() {
        return lengthC;
    }

    @Override
    public double area() {
        double p = (lengthA + lengthB + lengthC) / 2;
        double area;
        return area = Math.sqrt(p * (p - lengthA) * (p - lengthB) * (p - lengthC));
    }

    @Override
    public double perimeter() {
        double perimeter;
        return perimeter = lengthA + lengthB + lengthC;
    }
}
