package Ex2_SetsAndMaps;

import java.util.*;

/**
 * Created by Niki on 18.5.2016 г..
 */
public class Problem8_HandsOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> types = Arrays.asList(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"});
        List<String> suits = Arrays.asList(new String[]{"0", "C", "D", "H", "S"});

        String name = "";
        String cardsString = "";
        LinkedHashMap<String, HashSet<String>> data = new LinkedHashMap<>();

        String input = sc.nextLine();
        while (!input.equals("JOKER")) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ':') {
                    name = input.substring(0, i).trim();
                    cardsString = input.substring(i + 2, input.length()).trim();
                    break;
                }
            }

            String[] cards = cardsString.split(", ");

            if (!data.containsKey(name)) {
                data.put(name, new HashSet<>());
            }
            for (int i = 0; i < cards.length; i++) {
                data.get(name).add(cards[i]);
            }

            input = sc.nextLine();
        }

        for (Map.Entry<String, HashSet<String>> entrys : data.entrySet()) {
            System.out.printf("%s: ", entrys.getKey());
            int sum = 0;
            for (String string : entrys.getValue()) {
                String card = string.substring(0, string.length() - 1);
                String suit = string.substring(string.length() - 1, string.length());

                sum += types.indexOf(card) * suits.indexOf(suit);
            }
            System.out.println(sum);
        }
    }
}
