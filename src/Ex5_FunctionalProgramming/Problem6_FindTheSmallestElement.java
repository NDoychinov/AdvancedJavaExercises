package Ex5_FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Niki on 22.5.2016 г..
 */
public class Problem6_FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        List<Long> nums;
        int minIndex = 0;
        if (input.length() > 0) {
            nums = Arrays.asList(input.trim().split("\\s+")).stream().map(s -> Long.parseLong(s)).collect(Collectors.toList());

            Long min = Long.MAX_VALUE;


            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) <= min) {
                    min = nums.get(i);
                    minIndex = i;
                }
            }
        }
        System.out.println(minIndex);

    }
}
