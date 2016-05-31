package Ex2_SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Created by Niki on 18.5.2016 г..
 */
public class Problem1_UniqueUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        LinkedHashSet<String> users = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            users.add(name);
        }
        for (String user : users) {
            System.out.println(user);
        }
    }
}
