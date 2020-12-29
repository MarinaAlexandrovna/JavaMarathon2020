package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Программа начинает работу");
        int maxElement = 0, minElement = 10000, elementNol = 0, sumNol = 0;

        int[] myMass = new int[100];

        for (int a = 0; a < myMass.length; a++) {
            myMass[a] = rand.nextInt(10000);
        }
        //System.out.println(Arrays.toString(moiMassiv)); для проверки
        System.out.println();
        //for (type itVar : array)
        for (int b : myMass) {
            if (b > maxElement) {
                maxElement = b;
            }
            if (b < minElement) {
                minElement = b;
            }
            if(b%10 == 0){
                elementNol = elementNol + 1;
                sumNol = sumNol + b;
            }
        }
        System.out.println();
        System.out.println("Максимальный элемент в массиве - " + maxElement);
        System.out.println("Минимальный элемент в массиве - " + minElement);
        System.out.println("Элементы заканчивающиеся на ноль - " + elementNol);
        System.out.println("Сумма элементов заканчивающиеся на ноль - " +sumNol );

    }
}
