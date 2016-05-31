package Ex1_StacksAndQueues;

import java.util.Scanner;

/**
 * Created by Niki on 17.5.2016 г..
 */
public class Problem8_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long first = 1;
        long second = 1;
        long total = 1;
        for (int i = 0; i < n - 1; i++) {
            total = first + second;
            first = second;
            second = total;
        }
        System.out.println(total);
    }
}
