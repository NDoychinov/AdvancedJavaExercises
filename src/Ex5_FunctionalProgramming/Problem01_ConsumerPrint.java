package Ex5_FunctionalProgramming;

import java.util.Scanner;

/**
 * Created by Niki on 9.6.2016 г..
 */
public class Problem01_ConsumerPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = sc.nextLine().trim().split("\\s+");

        for (int i = 0; i < names.length; i++) {
            System.out.println("Sir " + names[i]);
        }
    }
}
