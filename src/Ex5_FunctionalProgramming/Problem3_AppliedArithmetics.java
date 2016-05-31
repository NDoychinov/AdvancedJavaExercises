package Ex5_FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Niki on 22.5.2016 г..
 */
public class Problem3_AppliedArithmetics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numsStr = sc.nextLine();
        List<Integer> nums = new ArrayList<>();
        if (numsStr.length() > 0) {
            nums = Arrays.asList(numsStr.trim().split("\\s+")).stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        }

        String command = sc.nextLine().toLowerCase();
        while (!command.equals("end")) {
            for (int i = 0; i < nums.size(); i++) {
                if (command.equals("add")) {
                    nums.set(i, nums.get(i) + 1);
                } else if (command.equals("subtract")) {
                    nums.set(i, nums.get(i) - 1);
                } else if (command.equals("multiply")) {
                    nums.set(i, nums.get(i) * 2);
                } else if (command.equals("print")) {
                    System.out.printf("%d ", nums.get(i));
                }
            }
            if (command.equals("print")){
                System.out.println();
            }

            command = sc.nextLine().toLowerCase();
        }
    }
}
