package Ex2_SetsAndMaps;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Niki on 18.5.2016 г..
 */
public class Problem3_PeriodicTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        TreeSet<String> table = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] input =  sc.nextLine().split("\\s+");

            for (int j = 0; j < input.length; j++) {
                table.add(input[j]);
            }
        }

        for (String s : table) {
            System.out.printf("%s ", s);
        }
    }
}
