package Ex6_StreamAPI;

import java.util.*;

/**
 * Created by Niki on 31.5.2016 г..
 */
public class Problem13_OfficeStuff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, LinkedHashMap<String, Integer>> data = new TreeMap<>();

        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            String[] input = sc.nextLine().trim().split("[\\| -]+");

            if (!data.containsKey(input[1])){
                data.put(input[1], new LinkedHashMap<>());
            }
            if (!data.get(input[1]).containsKey(input[3])){
                data.get(input[1]).put(input[3], 0);
            }
            data.get(input[1]).put(input[3], data.get(input[1]).get(input[3]) + Integer.parseInt(input[2]));
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> entrys : data.entrySet()) {
            System.out.printf("%s: ", entrys.getKey());
            LinkedHashMap<String, Integer> map = entrys.getValue();
            String output = "";
            for (Map.Entry<String, Integer> maps : map.entrySet()) {
                output += String.format("%s-%d, ", maps.getKey(), maps.getValue());
            }
            System.out.println(output.substring(0, output.length() - 2));
        }
    }
}
