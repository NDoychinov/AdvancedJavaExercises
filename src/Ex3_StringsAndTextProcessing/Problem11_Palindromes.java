package Ex3_StringsAndTextProcessing;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Niki on 20.5.2016 г..
 */
public class Problem11_Palindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().trim().split("[ ,.!?]+");

        List<String> palin = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (IsPalindrome(words[i])) {
                if (!palin.contains(words[i])){
                    palin.add(words[i]);
                }
            }
        }

        Collator myCollator = Collator.getInstance();
        Collections.sort(palin, (s1, s2) ->  myCollator.compare(s1, s2));
        System.out.println(palin.toString());
    }

    public static boolean IsPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
