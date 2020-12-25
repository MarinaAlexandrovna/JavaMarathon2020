package day2;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the number");
        int a = sc.nextInt();
        System.out.println("Print the number");
        int b = sc.nextInt();


        for (int i = a; i < b; i++) {
            while (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
                i++;
            }
        }
    }
}
