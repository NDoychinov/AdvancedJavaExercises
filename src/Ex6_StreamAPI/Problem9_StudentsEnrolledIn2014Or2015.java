package Ex6_StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Niki on 31.5.2016 г..
 */
public class Problem9_StudentsEnrolledIn2014Or2015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> names = new ArrayList<>();

        while (!input.equals("END")) {
            String[] data = input.split("\\s+");
            if (data[0].endsWith("15") || data[0].endsWith("14")) {
                StringBuilder marks = new StringBuilder();
                for (int i = 1; i < data.length; i++) {
                    marks.append(data[i] + " ");
                }
                names.add(marks.toString());
            }

            input = sc.nextLine();
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
