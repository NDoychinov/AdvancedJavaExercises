package Ex2_SetsAndMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Niki on 18.5.2016 г..
 */
public class Problem4_CountSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeMap<Character, Integer> data = new TreeMap<>();
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (!data.containsKey(str.charAt(i))) {
                data.put(str.charAt(i), 1);
            } else {
                data.put(str.charAt(i), data.get(str.charAt(i) ) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entrys : data.entrySet()) {
            System.out.printf("%s: %d time/s%n", entrys.getKey(), entrys.getValue());
        }
    }
}
