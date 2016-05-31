package Ex5_FunctionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Niki on 22.5.2016 г..
 */
public class Problem7_CustomComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().trim();

        if (input.length() > 0) {
            List<Long> allNums = Arrays.asList(input.split("\\s+")).stream().map(s -> Long.parseLong(s)).collect(Collectors.toList());
            List<Long> evenNums = new ArrayList<>();
            List<Long> oddNums = new ArrayList<>();

            for (int i = 0; i < allNums.size(); i++) {
                if (Math.abs(allNums.get(i)) % 2 == 0) {
                    evenNums.add(allNums.get(i));
                } else {
                    oddNums.add(allNums.get(i));
                }
            }
            Collections.sort(evenNums);
            Collections.sort(oddNums);

            for (int i = 0; i < evenNums.size(); i++) {
                System.out.printf("%s ", evenNums.get(i));
            }
            for (int i = 0; i < oddNums.size(); i++) {
                System.out.printf("%s ", oddNums.get(i));
            }

        }

    }
}
