package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;

        while (true) {
            System.out.println("Введите число x");
            x = sc.nextDouble();
            System.out.println("Введите число y");
            y = sc.nextDouble();

            if (y == 0) {
                break;
            }
            System.out.println("Результат = " + x / y);
        }
    }
}
