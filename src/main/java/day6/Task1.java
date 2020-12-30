package day6;

public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.info();
        car1.setModel("W");
        car1.setYearOfIssue(1985);
        car1.setColor("Green");

        System.out.println("Модель машины " + car1.getModel() + "." + "\n"
                + "Год выпуска " + car1.getYearOfIssue() + "." + "\n"
                + "Цвет " + car1.getColor() + ".");
        System.out.println("разница между годом выпуска и натоящим годом - " + car1.yearDifference(2020));
        System.out.println();

        Motorbike motorbike = new Motorbike(1960, "Grey", "Java");
        motorbike.info();
        motorbike.getModel();
        motorbike.getYeatOfIssue();
        motorbike.getColor();
        System.out.println("разница между годом выпуска и го настоящим годом - " + motorbike.yearDifference(2020));
        System.out.println();

    }
}
