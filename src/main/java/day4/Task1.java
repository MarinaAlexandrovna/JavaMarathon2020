package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("Задайте размер массива");
        Scanner sc = new Scanner(System.in);
        int yslovie1 = 0, yslovie2 = 0, yslovie3 = 0, yslovie4 = 0, sumElementov = 0;

        int razmerMassiva = sc.nextInt();
        int[] myMass = new int[razmerMassiva];

        for (int i = 0; i < myMass.length; i++) {
            myMass[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(myMass));
        System.out.println("Длина массива - " + razmerMassiva);
        System.out.println();
        System.out.println("Теперь мы этот массив длинной в " + razmerMassiva + " элементов, изучим");
        System.out.println();


        for (int i = 0; i < myMass.length; i++) {
            int b = myMass[i];
            sumElementov = sumElementov + b;
            if (b > 8) {
                yslovie1 = yslovie1 + 1;
            } else if (b == 1) {
                yslovie2 = yslovie2 + 1;
            } else if (b % 2 == 0) {
                yslovie3 = yslovie3 + 1;
            } else if (b % 2 != 0) {
                yslovie4 = yslovie4 + 1;
            }
        }
        System.out.println("Результат иследования: ");
        System.out.println();

        if (yslovie1 == 0) {
            System.out.println("Элементов больше восьми в массиве нет");
        } else{
            System.out.println("Количество элементов массива больше 8 - " + yslovie1);
        }
        System.out.println("Числа равные еденице - " + yslovie2);
        System.out.println("Четные числа - " + yslovie3);
        System.out.println("Нечетные числа -" + yslovie4);
        System.out.println("Сумма всех элементов равна " + sumElementov);
    }
}
