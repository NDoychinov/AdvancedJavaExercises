package Ex1_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Niki on 16.5.2016 г..
 */
public class Problem4_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();
        int x = sc.nextInt();
        sc.nextLine();
        Queue<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            stack.add(sc.nextInt());
        }

        for (int i = 0; i < s; i++) {
            stack.remove();
        }

        if (stack.contains(x)) {
            System.out.println("true");
        } else {
            if (stack.size() > 0) {
                int smallest = stack.remove();
                while (stack.size() > 0) {
                    int curr = stack.remove();
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
