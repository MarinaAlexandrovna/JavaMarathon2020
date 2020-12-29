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

        System.out.println("Выведем нашу машину на экран");
        System.out.println();

        System.out.println("Модель машины " + car1.getModel() + "." + "\n"
                + "Год выпуска " + car1.getYearOfIssue() + "." + "\n"
                + "Цвет " + car1.getColor() + ".");
    }
}

class Car {
    private int yearOfIssue;
    private String color;
    private String model;

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
}
