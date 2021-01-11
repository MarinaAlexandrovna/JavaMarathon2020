package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Tesla");
        cars.add("Volvo");
        cars.add("Audi");
        cars.add("Kia");

        System.out.println(cars);

        cars.add(3, "Lada");
        System.out.println(cars);

        cars.remove(0);
        System.out.println(cars);


    }
}
