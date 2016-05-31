package Ex5_FunctionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Niki on 22.5.2016 г..
 */
public class Problem4_ReverseAndExclude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numsStr = sc.nextLine();
        List<Integer> nums = new ArrayList<>();
        if (numsStr.length() > 0) {
            nums = Arrays.asList(numsStr.trim().split("\\s+")).stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        }
        int divide = sc.nextInt();
        Collections.reverse(nums);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % divide != 0){
                System.out.printf("%s ", nums.get(i));
            }
        }
    }
}
