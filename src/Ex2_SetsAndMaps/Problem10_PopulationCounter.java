package Ex2_SetsAndMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created by Niki on 18.5.2016 г..
 */
public class Problem10_PopulationCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        LinkedHashMap<String, LinkedHashMap<String, Long>> countries = new LinkedHashMap<>();
        HashMap<String, Long> countryTotal = new HashMap<>();

        while (!input.equals("report")) {
            String[] info = input.split("\\|");

            String city = info[0].trim();
            String country = info[1].trim();
            long population = Long.parseLong(info[2].trim());


            if (!countries.containsKey(country)) {
                countries.put(country, new LinkedHashMap<>());
                countries.get(country).put(city, population);

                countryTotal.put(country, population);
            } else if (!countries.get(country).containsKey(city)) {
                countries.get(country).put(city, population);

                countryTotal.put(country, countryTotal.get(country) + population);
            } else {
                countries.get(country).put(city, countries.get(country).get(city) + population);

                countryTotal.put(country, countryTotal.get(country) + population);
            }

            input = sc.nextLine();
        }

        countries.entrySet().stream().
                sorted((n1, n2) -> Long.compare(countryTotal.get(n2.getKey()), countryTotal.get(n1.getKey()))).forEach(entry -> {
            System.out.printf("%s (total population: %d)%n", entry.getKey(), countryTotal.get(entry.getKey()));
            entry.getValue().entrySet().stream().sorted((s1, s2) -> Long.compare(s2.getValue(), s1.getValue())).forEach(en -> {
                System.out.printf("=>%s: %d%n", en.getKey(), en.getValue());
            });
        });
    }
}
