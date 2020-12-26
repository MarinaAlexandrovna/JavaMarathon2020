package day2;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the number");
        int a = sc.nextInt();
        System.out.println("Print the number");
        int b = sc.nextInt();

        int t = a + 1;

        while(t < b){
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(t + " ");
            }
            t++;

        }
    }
}
