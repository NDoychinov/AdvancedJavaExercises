package Ex6_StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Niki on 31.5.2016 г..
 */
public class Problem8_WeakStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> names = new ArrayList<>();

        while (!input.equals("END")) {
            String[] data = input.split("\\s+");
            int badMarkCount = 0;
            for (int i = 2; i < data.length; i++) {
                if (Integer.parseInt(data[i]) < 4){
                    badMarkCount++;
                }
            }

            if (badMarkCount > 1) {
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
