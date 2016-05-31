package Ex2_SetsAndMaps;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Niki on 18.5.2016 г..
 */
public class Problem5_Phonebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> phonebook = new HashMap<>();
        String input = sc.nextLine();
        try {
            while (!input.toLowerCase().equals("search")) {
                String name = input.split("-")[0];
                String phone = input.split("-")[1];
                phonebook.put(name, phone);

                input = sc.nextLine();
            }

            input = sc.nextLine();

            while (!input.toLowerCase().equals("stop")) {
                if (phonebook.containsKey(input)) {
                    System.out.printf("%s -> %s%n", input, phonebook.get(input));
                } else {
                    System.out.printf("Contact %s does not exist.%n", input);
                }

                input = sc.nextLine();
            }
        }catch (Exception e){

        }
    }
}