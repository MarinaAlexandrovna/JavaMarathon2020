package day4;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] myMass = new int[100];

        int sumChisel = 0, maxSum = 0, indexStroki = 0;

        for (int i = 0; i < myMass.length; i++) {
            myMass[i] = rand.nextInt(10000);
            //System.out.print(moiMassiv[i] + "\t");
        }

        System.out.println();

        for (int k = 0; k < myMass.length - 2; k++) {
            sumChisel = myMass[k] + myMass[k + 1] + myMass[k + 2];
            if(sumChisel>maxSum){
                maxSum = sumChisel;
                indexStroki = k;
            }
            //System.out.print(moiMassiv[k] + " ");
            //System.out.print(moiMassiv[k + 1] + " ");
            //System.out.print(moiMassiv[k + 2] + "\t");
            //System.out.println(sumChisel);
        }
        System.out.println("Максимальное значение - " + maxSum);
        System.out.println("А вот это его индекс - " + indexStroki);
        System.out.println();
        System.out.println("Проверено, что считает правильно");
    }
}
