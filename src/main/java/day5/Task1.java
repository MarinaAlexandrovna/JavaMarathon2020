package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearOfIssue(1985);
        car1.setModel("W");
        car1.setColor("Green");
        car1.getYearOfIssue();
        car1.getModel();
        car1.getColor();

        Car car2 = new Car();
        car2.setYearOfIssue(2019);
        car2.setModel("Lada");
        car2.setColor("Rad");
        car2.getYearOfIssue();
        car2.getModel();
        car2.getColor();


        System.out.println("Выведем нашу машину на экран");
        System.out.println();

        System.out.println("Модель машины " + car1.getModel() + "." + "\n"
                + "Год выпуска " + car1.getYearOfIssue() + "." + "\n"
                + "Цвет " + car1.getColor() + ".");

        System.out.println("Модель машины " + car2.getModel() + "." + "\n"
                + "Год выпуска " + car2.getYearOfIssue() + "." + "\n"
                + "Цвет " + car2.getColor() + ".");
    }
}

class Car {
    private int yearOfIssue;
    private String color;
    private String model;
    private int inputYear;

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    int result;

    public int yearDifference(int inputYear) {
        result = yearOfIssue - inputYear;
        return result;
    }
}
