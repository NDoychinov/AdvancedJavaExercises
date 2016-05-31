package Ex2_SetsAndMaps;

import java.util.*;

/**
 * Created by Niki on 18.5.2016 г..
 */
public class Problem11_LogsAggregator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        TreeMap<String, TreeSet<String>> users = new TreeMap<>();
        HashMap<String, Integer> totalTime = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] splited = input.split("\\s+");

            String ip = splited[0];
            String name = splited[1];
            int time = Integer.parseInt(splited[2]);

            if (!users.containsKey(name)){
                users.put(name, new TreeSet<>());
                users.get(name).add(ip);

                totalTime.put(name, time);
            } else {
                users.get(name).add(ip);

                totalTime.put(name, totalTime.get(name) + time);
            }
        }

        for (Map.Entry<String, TreeSet<String>> entrys : users.entrySet()) {
            System.out.printf("%s: %d %s%n", entrys.getKey(), totalTime.get(entrys.getKey()), entrys.getValue().toString());
        }
    }
}
