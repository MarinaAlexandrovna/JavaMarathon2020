package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        int a = 1;

        while (a <= 5) {
            System.out.println("Пошел цикл " + a);
            System.out.println("Введите число x");
            x = sc.nextDouble();
            System.out.println("Введите число y");
            y = sc.nextDouble();

            if (y == 0) {
                System.out.println("Нельзя делить на ноль");
                continue;
            }
            System.out.println("Результат = " + x / y);
            a = a + 1;
        }
    }
}
