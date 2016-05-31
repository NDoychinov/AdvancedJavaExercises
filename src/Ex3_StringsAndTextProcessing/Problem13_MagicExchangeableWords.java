package Ex3_StringsAndTextProcessing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Niki on 20.5.2016 г..
 */
public class Problem13_MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String word1 = sc.next();
        System.out.println(IsExchangeable(word, word1));
    }

    public static boolean IsExchangeable(String word, String word1) {
        HashMap<Character, Character> firstChars = new HashMap<>();
        HashMap<Character, Character> secondChars = new HashMap<>();
        String formedStr = "";
        if (word.length() == word1.length()) {
            for (int i = 0; i < word.length(); i++) {
                if (!firstChars.containsKey(word.charAt(i))) {
                    firstChars.put(word.charAt(i), word1.charAt(i));
                }
                formedStr += firstChars.get(word.charAt(i));
            }
            if (formedStr.equals(word1)) {
                return true;
            }
        } else {
            String longer = "";
            String shorter = "";
            if (word.length() > word1.length()) {
                longer = word;
                shorter = word1;
            } else {
                longer = word1;
                shorter = word;
            }


            for (int i = 0; i < shorter.length(); i++) {
                if (!firstChars.containsKey(shorter.charAt(i))) {
                    firstChars.put(shorter.charAt(i), longer.charAt(i));
                }
                if (!secondChars.containsKey(longer.charAt(i))) {
                    secondChars.put(longer.charAt(i), shorter.charAt(i));
                }
            }

            HashSet<Character> chars1 = new HashSet<>();
            HashSet<Character> chars2 = new HashSet<>();

            for (int i = 0; i < shorter.length(); i++) {
                if (firstChars.containsKey(shorter.charAt(i))) {
                    chars1.add(firstChars.get(shorter.charAt(i)));
                }
            }
            for (int i = 0; i < word1.length(); i++) {
                if (secondChars.containsKey(longer.charAt(i))) {
                    chars2.add(secondChars.get(longer.charAt(i)));
                } else {
                    chars2.add(longer.charAt(i));
                }
            }
            Random rnd = new Random();
            int random = rnd.nextInt(2);
            if (random == 0) {
                if (chars1.size() >= chars2.size()) {
                    return true;
                }
            } else {
                if (chars1.size() > chars2.size()) {
                    return true;
                }
            }
        }
        return false;
    }
}