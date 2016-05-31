package Ex2_SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Niki on 18.5.2016 г..
 */
public class Problem6_AMinerTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, Integer> collected = new LinkedHashMap<>();

        String type = sc.nextLine();

        while (!type.toLowerCase().equals("stop")){
            int quantity = sc.nextInt();
            sc.nextLine();

            if (!collected.containsKey(type)){
                collected.put(type, 0);
            }
            collected.put(type, collected.get(type) + quantity);
            type = sc.nextLine();
        }

        for (Map.Entry<String, Integer> collect : collected.entrySet()) {
            System.out.printf("%s -> %s%n", collect.getKey(), collect.getValue());
        }
    }
}
