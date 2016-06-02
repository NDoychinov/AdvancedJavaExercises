package Ex6_StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Niki on 31.5.2016 г..
 */
public class Problem2_StudentsByFirstAndLastName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> names = new ArrayList<>();

        while (!input.equals("END")) {
            String[] data = input.split("\\s+");
            if (data[0].compareTo(data[1]) < 0) {
                String name = data[0] + " " + data[1];
                names.add(name);
            }

            input = sc.nextLine();
        }


        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
