package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] myMass = new int[12][8];

        Random rand = new Random();

        int k = 0;

        for (int i = 0; i < myMass.length; i++) {
            for (int j = 0; j < myMass[i].length; j++) {
                myMass[i][j] = rand.nextInt(50);
            }
        }
        int sumChisel = 0, maxSum = 0, indexStroki = 0;

        for (int i = 0; i < myMass.length; i++) {
            for (int j = 0; j < myMass[i].length; j++) {
                sumChisel = sumChisel + myMass[i][j];
                System.out.print(myMass[i][j] + "\t");
                k = j;
            }

            System.out.print("(сумма чисел строки = " + sumChisel + ") ");

            if (sumChisel > maxSum) {
                maxSum = sumChisel;
                indexStroki = k;
            }
            sumChisel = 0;
            System.out.println();
        }
        System.out.println();
        System.out.println("Cтрока с максимальной суммой чисел - " +indexStroki + "," + " она = " + maxSum);
    }
}
