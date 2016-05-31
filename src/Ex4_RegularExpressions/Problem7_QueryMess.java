package Ex4_RegularExpressions;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Niki on 21.5.2016 г..
 */
public class Problem7_QueryMess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern patt = Pattern.compile("([^&?]+)\\s*=\\s*(.*?)(?:&|$)");

        String input = sc.nextLine().trim();
        while (!input.equals("END")) {
            input = input.replaceAll("%20", " ");
            input = input.replaceAll("\\+", " ");
            input = input.replaceAll("  +", " ");

            Matcher matcher = patt.matcher(input);
            LinkedHashMap<String, LinkedList<String>> data = new LinkedHashMap<>();
            while (matcher.find()){
                String key = matcher.group(1).trim();
                String value = matcher.group(2).trim();

                if (!data.containsKey(key)){
                    data.put(key, new LinkedList<>());
                }
                data.get(key).add(value);
            }

            for (Map.Entry<String, LinkedList<String>> entrys : data.entrySet()) {
                System.out.printf("%s=%s", entrys.getKey(), entrys.getValue().toString());
            }
            System.out.println();

            input = sc.nextLine().trim();
        }

    }
}
