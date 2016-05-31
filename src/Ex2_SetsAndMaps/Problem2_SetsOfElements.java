package Ex2_SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Niki on 18.5.2016 г..
 */
public class Problem2_SetsOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lenN = sc.nextInt();
        int lenM = sc.nextInt();
        sc.nextLine();

        LinkedHashSet<Integer> n = new LinkedHashSet<>();
        LinkedHashSet<Integer> m = new LinkedHashSet<>();

        for (int i = 0; i < lenN; i++) {
            n.add(sc.nextInt());
        }
        for (int i = 0; i < lenM; i++) {
            m.add(sc.nextInt());
        }

        LinkedList<Integer> nums = new LinkedList<>();
        for (Integer integer : n) {
            if (m.contains(integer)) {
                System.out.printf("%d ", integer);
            }
        }
     }
}
