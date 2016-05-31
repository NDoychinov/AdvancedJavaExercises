package Ex5_FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Niki on 22.5.2016 г..
 */
public class Problem1_CustomMinFunction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Integer> nums = new ArrayList<>();
        if (input.length() > 0) {
            nums = Arrays.asList(input.trim().split("\\s+")).stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        if (input.length() > 0) {
            System.out.println(min);
        }

    }
}
