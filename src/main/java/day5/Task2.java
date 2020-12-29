package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike(1998, "Grey", "Java");
        motorbike1.getModel();
        motorbike1.getYeatOfIssue();
        motorbike1.getColor();
    }
}

class Motorbike {
    private int yearOfIssue;
    private String color;
    private String model;

    public Motorbike(int yearOfIssue, String color, String model) {
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.model = model;
    }

    public void getModel() {
        System.out.println("Модель мотоцикла - " + model);
    }

    public void getYeatOfIssue() {
        System.out.println("Год выпуска - " + yearOfIssue);
    }

    public void getColor() {
        System.out.println("Цвет - " + color);
    }
}
