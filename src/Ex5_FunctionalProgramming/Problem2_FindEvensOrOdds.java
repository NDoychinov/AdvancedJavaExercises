package Ex5_FunctionalProgramming;

import java.util.Scanner;

/**
 * Created by Niki on 22.5.2016 г..
 */
public class Problem2_FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long low = sc.nextLong();
        long max = sc.nextLong();
        sc.nextLine();
        String command = sc.nextLine().toLowerCase();

        for (long i = low; i <= max; i++) {
            if (command.equals("even")) {
                if (Math.abs(i) % 2 == 0) {
                    System.out.printf("%d ", i);
                }
            } else if (command.equals("odd")) {
                if (Math.abs(i) % 2 == 1) {
                    System.out.printf("%d ", i);
                }
            }
        }

    }
}
