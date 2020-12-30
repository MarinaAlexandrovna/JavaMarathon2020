package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane fly = new Airplane("Germany", 2002, 50, 76.25, 162);
        fly.setYear(1999);
        fly.setLength(70);

        fly.fullUp(20000);
        fly.fullUp(10000);

        fly.info();
    }
}
