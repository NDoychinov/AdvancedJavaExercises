package Ex1_StacksAndQueues;

import java.util.*;

/**
 * Created by Niki on 17.5.2016 г..
 */
public class Problem11_PoisonousPlants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 10000){
            boolean check = false;
            LinkedList<Integer> all = new LinkedList<>();
            int previous = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int add = sc.nextInt();
                all.add(add);
                if (i > 0 && add > previous) {
                    check = true;
                }
                previous = add;
            }

            int count = 0;

            while (check) {
                check = false;
                for (int i = all.size() - 1; i > 0; i--) {
                    if (all.get(i) > all.get(i - 1)) {
                        all.remove(i);
                        check = true;
                    }
                }
                count++;
            }
            System.out.println(count - 1);
        }else {

            Stack<Integer> plants = new Stack<>();

            plants.add(sc.nextInt());
            int count = 0;
            int bigCount = 0;
            for (int i = 0; i < n - 1; i++) {
                int add = sc.nextInt();
                if (plants.peek() >= add) {
                    plants.add(add);
                    count = 0;
                    if (count > bigCount) {
                        bigCount = count;
                    }
                } else {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}