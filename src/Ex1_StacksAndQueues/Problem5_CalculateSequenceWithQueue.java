package Ex1_StacksAndQueues;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by Niki on 16.5.2016 г..
 */
public class Problem5_CalculateSequenceWithQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal n = sc.nextBigDecimal();
        List<BigDecimal> ses = new ArrayList<>();
        Queue<BigDecimal> queue = new ArrayDeque<>();

        ses.add(n);
        System.out.printf(n + " ");
        for (int i = 0; i < 17; i++) {
            queue.add(ses.get(i).add(new BigDecimal("1")));
            ses.add(ses.get(i).add(new BigDecimal("1")));

            queue.add((ses.get(i).multiply(new BigDecimal("2")).add(new BigDecimal("1"))));
            ses.add((ses.get(i).multiply(new BigDecimal("2")).add(new BigDecimal("1"))));

            queue.add(ses.get(i).add(new BigDecimal("2")));
            ses.add(ses.get(i).add(new BigDecimal("2")));
        }

        for (int i = 0; i < 49; i++) {
            System.out.printf(queue.poll() + " ");
        }
    }
}
