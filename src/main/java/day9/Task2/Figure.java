package day9.Task2;
/*Реализация первого метода должна возвращать площадь фигуры,
а реализация второго метода должна возвращать периметр фигуры.*/

public abstract class Figure {
    private String color;


    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public Figure(){
    }

    public abstract double area();{

    }
    public abstract double perimeter();{

    }
}
