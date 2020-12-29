package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the number");
        double x = sc.nextDouble();
        double y;

        if (x >= 5) {
            System.out.println("Вариант 1: y = " + (y = (Math.pow(x, 2) - 10) / (x + 7)));
        } else if (x > -3 && x < 5) {
            System.out.println("Вариант 2: y = " + (y = (x + 3) * (Math.pow(x, 2) - 2)));
        } else {
            System.out.println("Вариант 3: y = 420");
        }
    }
}

