package Ex5_FunctionalProgramming;

import java.util.Scanner;

/**
 * Created by Niki on 22.5.2016 г..
 */
public class Problem5_PredicateForNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String inputNames = sc.nextLine();

        if (inputNames.length() > 0) {
            String[] names = inputNames.trim().split("\\s+");

            for (int i = 0; i < names.length; i++) {
                if (names[i].length() <= size){
                    System.out.println(names[i]);
                }
            }
        }

    }
}
