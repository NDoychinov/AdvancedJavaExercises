package Ex1_StacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Niki on 16.5.2016 г..
 */
public class Problem1_ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < input.length; i++) {
            stack.add(Integer.parseInt(input[i]));
        }

        while (stack.size() > 0){
            System.out.printf(stack.pop() + " ");
        }
    }
}
