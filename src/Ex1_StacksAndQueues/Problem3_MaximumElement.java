package Ex1_StacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Niki on 16.5.2016 г..
 */
public class Problem3_MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        int maxEl = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num == 1) {
                int add = sc.nextInt();
                stack.push(add);
                if (add > maxEl){
                    maxEl = add;
                    maxStack.push(add);
                }
            } else if (num == 2) {
                int popEl = stack.pop();
                if (popEl == maxEl){
                    maxStack.pop();
                    maxEl = maxStack.peek();
                }
            } else {
                System.out.println(maxEl);
            }
        }
    }
}
