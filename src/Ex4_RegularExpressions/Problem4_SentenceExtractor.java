package Ex4_RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Niki on 21.5.2016 г..
 */
public class Problem4_SentenceExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matchWord = sc.nextLine();
        Pattern patt = Pattern.compile("(?:[.!?^ ]|^)*([^.!?]*[^a-zA-Z]" + matchWord + "(?:[.?!]|[^a-zA-Z].*?[.?!]))");

        String input = sc.nextLine();
        Matcher matcher = patt.matcher(input);

        while (matcher.find()){
            System.out.println(matcher.group(1));
        }
    }
}
