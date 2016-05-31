package Ex5_FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Niki on 22.5.2016 г..
 */
public class Problem8_ListOfPredicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine().trim();

        if (input.length() > 0) {
            List<Integer> allNums = Arrays.asList(input.split("\\s+")).stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());

            for (int i = 1; i <= n; i++) {
                boolean isDivisible = true;
                for (int j = 0; j < allNums.size(); j++) {
                    if (i % allNums.get(j) != 0){
                        isDivisible = false;
                        break;
                    }
                }
                if (isDivisible) {
                    System.out.printf("%s ", i);
                }
            }

        }

    }
}
