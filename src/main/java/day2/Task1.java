package day2;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the number of the floors");
        int x = sc.nextInt();

        if (x >= 1 && x <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (x >= 5 && x <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (x >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
