package Ex1_StacksAndQueues;

import java.util.Scanner;

/**
 * Created by Niki on 17.5.2016 г..
 */
public class Problem7_BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        boolean check = true;
        for (int i = 0; i < input.length() / 2; i++) {
            char ch = input.charAt(i) == '(' ? (char) ((int) input.charAt(i) + 1) : (char) ((int) input.charAt(i) + 2);

            if (ch != input.charAt(input.length() - 1 - i)) {
                check = false;
            }
        }
        if (check && input.length() % 2 == 0 && input.length() > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
