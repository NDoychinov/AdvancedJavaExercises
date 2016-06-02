package Ex6_StreamAPI;

import java.util.*;

/**
 * Created by Niki on 31.5.2016 г..
 */
public class Problem10_GroupByGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        HashMap<String, List<String>> groups = new HashMap<>();

        while (!input.equals("END")) {
            String[] data = input.split("\\s+");
            if (!groups.containsKey(data[2])) {
                groups.put(data[2], new ArrayList<>());
            }
            groups.get(data[2]).add(data[0] + " " + data[1]);

            input = sc.nextLine();
        }

        for (Map.Entry<String, List<String>> stringListEntry : groups.entrySet()) {
            System.out.printf("%s - ", stringListEntry.getKey());
            System.out.println(stringListEntry.getValue().toString().replace('[', '\0').replace(']', '\0'));
        }
    }
}
