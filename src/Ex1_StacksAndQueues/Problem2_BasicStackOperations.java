package Ex1_StacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Niki on 16.5.2016 г..
 */
public class Problem2_BasicStackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();
        int x = sc.nextInt();
        sc.nextLine();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            stack.add(sc.nextInt());
        }

        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        if (stack.contains(x)) {
            System.out.println("true");
        } else {
            if (stack.size() > 0) {
                int smallest = stack.pop();
                while (stack.size() > 0) {
                    int curr = stack.pop();
                    if (curr < smallest) {
                        smallest = curr;
                    }
                }
                System.out.println(smallest);
            } else {
                System.out.println(0);
            }
        }
    }
}
