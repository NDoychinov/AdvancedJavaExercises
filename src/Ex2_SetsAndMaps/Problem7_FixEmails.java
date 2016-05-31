package Ex2_SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Niki on 18.5.2016 г..
 */
public class Problem7_FixEmails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, String> collected = new LinkedHashMap<>();

        String name = sc.nextLine();

        while (!name.toLowerCase().equals("stop") && !name.toLowerCase().equals("")){
            String email = sc.nextLine();
            String domain = email.substring(email.length() - 2, email.length()).toLowerCase();

            if (!collected.containsKey(name) && !domain.equals("us") && !domain.equals("uk")){
                collected.put(name, email);
            }
            name = sc.nextLine();
        }

        for (Map.Entry<String, String> collect : collected.entrySet()) {
            System.out.printf("%s -> %s%n", collect.getKey(), collect.getValue());
        }
    }
}
