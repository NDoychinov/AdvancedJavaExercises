package Ex5_FunctionalProgramming;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Niki on 24.5.2016 г..
 */
public class Problem13_TheBiggestOrSmallestInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namesLine = sc.nextLine().trim();
        if (namesLine.length() > 0) {
            LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(namesLine.split("\\s+")).stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList()));
            String command = sc.nextLine();

            if (command.equals("minEven")) {
                System.out.println(minEven(nums));
            } else if (command.equals("maxEven")) {
                System.out.println(maxEven(nums));
            } else if (command.equals("minOdd")) {
                System.out.println(minOdd(nums));
            } else if (command.equals("maxOdd")) {
                System.out.println(minOdd(nums));
            }

        }
    }

    public static String minEven(List<Integer> nums) {
        int minEven = Integer.MAX_VALUE;
        boolean check = false;
        for (int i = 0; i < nums.size(); i++) {
            if (Math.abs(nums.get(i)) % 2 == 0 && nums.get(i) <= minEven) {
                minEven = nums.get(i);
                check = true;
            }
        }
        if (check) {
            return String.valueOf(minEven);
        } else {
            return "";
        }
    }

    public static String maxEven(List<Integer> nums) {
        int minEven = Integer.MIN_VALUE;
        boolean check = false;
        for (int i = 0; i < nums.size(); i++) {
            if (Math.abs(nums.get(i)) % 2 == 0 && nums.get(i) >= minEven) {
                minEven = nums.get(i);
                check = true;
            }
        }
        if (check) {
            return String.valueOf(minEven);
        } else {
            return "";
        }
    }

    public static String minOdd(List<Integer> nums) {
        int minEven = Integer.MAX_VALUE;
        boolean check = false;
        for (int i = 0; i < nums.size(); i++) {
            if (Math.abs(nums.get(i)) % 2 == 1 && nums.get(i) <= minEven) {
                minEven = nums.get(i);
                check = true;
            }
        }
        if (check) {
            return String.valueOf(minEven);
        } else {
            return "";
        }
    }

    public static String maxOdd(List<Integer> nums) {
        int minEven = Integer.MIN_VALUE;
        boolean check = false;
        for (int i = 0; i < nums.size(); i++) {
            if (Math.abs(nums.get(i)) % 2 == 1 && nums.get(i) >= minEven) {
                minEven = nums.get(i);
                check = true;
            }
        }
        if (check) {
            return String.valueOf(minEven);
        } else {
            return "";
        }
    }

}
