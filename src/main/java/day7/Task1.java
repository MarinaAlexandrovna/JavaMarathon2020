package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airoflot", 2010, 70, 567);
        Airplane airplane2 = new Airplane("Boing", 1990, 34, 400);

        System.out.println();
        Airplane.compareAirplanes(airplane,airplane2);

    }
}