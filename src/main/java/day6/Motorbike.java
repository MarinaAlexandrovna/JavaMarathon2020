package day6;


public class Motorbike {
    private int yearOfIssue;
    private String color;
    private String model;
    private int inputYear;


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

    public void info(){
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        int result;
        result = Math.abs(inputYear - yearOfIssue);
        return result;
    }
        /*public int Difference(int a, int b){
            return Math.abs(a-b);*/
}
