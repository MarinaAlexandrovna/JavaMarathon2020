package day8;

public class Task1 {
    public static void main(String[] args) {
        String numbers = "";

        long before = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            numbers += i + " ";
        }
        long after = System.currentTimeMillis();

        System.out.println(numbers);
        System.out.println("Время которое тратит программа - " + (after - before));
        System.out.println();

        StringBuilder sb = new StringBuilder("");

        long beforeSb = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }

        long afterSb = System.currentTimeMillis();

        System.out.println(sb);
        System.out.println("Время которое тратит программа - " + (afterSb - beforeSb));

    }
}
