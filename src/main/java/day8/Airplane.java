package day8;

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private double fuel;

    public Airplane(String producer, int year, int length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public void info(){
        System.out.println("Изготовитель: " + producer + ". " + "Год выпуска: " + year
                    + ". " + "Длина самолета: " + length + ". " + "Вес самолета: " + weight
                    + ". " + "Количества топлива в баке - " + fuel);
    }
    public void fullUp(int newFuel){
        fuel = fuel + newFuel;
    }

    public String toString(){
        return "Изготовитель: " + producer + ". " + "Год выпуска: " + year
                + ". " + "Длина самолета: " + length + ". " + "Вес самолета: " + weight
                + ". " + "Количества топлива в баке - " + fuel;
    }

}
