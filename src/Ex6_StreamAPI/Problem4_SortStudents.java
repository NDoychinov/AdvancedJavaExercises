package Ex6_StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Niki on 31.5.2016 г..
 */
public class Problem4_SortStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> names = new ArrayList<>();

        while (!input.equals("END")) {
            String[] data = input.split("\\s+");
            String name = data[0] + " " + data[1];
            names.add(name);

            input = sc.nextLine();
        }

        Collections.sort(names, (s1, s2) -> s2.split(" ")[0].compareTo(s1.split(" ")[0]));
        Collections.sort(names, (s1, s2) -> s1.split(" ")[1].compareTo(s2.split(" ")[1]));


        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
