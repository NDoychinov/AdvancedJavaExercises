package Ex2_SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Niki on 18.5.2016 г..
 */
public class Problem13_SrabskoUnleashed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pattern patt = Pattern.compile("^((?:[A-Za-z]+)(?: [A-Za-z]+)?(?: [A-Za-z]+)?) @((?:[A-Za-z]+)(?: [A-Za-z]+)?(?: [A-Za-z]+)?) ([0-9]+) ([0-9]+)$");

        LinkedHashMap<String, LinkedHashMap<String, Long>> data = new LinkedHashMap<>();

        String input = sc.nextLine();

        while (!input.equals("End")) {
            Matcher matcher = patt.matcher(input);

            if (matcher.find()) {
                String singer = matcher.group(1);
                String venue = matcher.group(2);
                long ticketPrice = Long.parseLong(matcher.group(3));
                long tickets = Long.parseLong(matcher.group(4));

                if (!data.containsKey(venue)) {
                    data.put(venue, new LinkedHashMap<>());
                    data.get(venue).put(singer, ticketPrice * tickets);
                } else if (!data.get(venue).containsKey(singer)) {
                    data.get(venue).put(singer, ticketPrice * tickets);
                } else {
                    data.get(venue).put(singer, data.get(venue).get(singer) + ticketPrice * tickets);
                }
            }

            input = sc.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Long>> entrys : data.entrySet()) {
            System.out.println(entrys.getKey());
            entrys.getValue().entrySet().stream().sorted((n1, n2) -> Long.compare(n2.getValue(), n1.getValue())).forEach(en -> {
                System.out.printf("#  %s -> %d%n", en.getKey(), en.getValue());
            });
        }
    }
}
