package Ex3_StringsAndTextProcessing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Niki on 20.5.2016 г..
 */
public class Problem16_ExtractHyperlinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern patt = Pattern.compile("(?:<a)(?:[\\s\\n_0-9a-zA-Z=\"\"()]*?.*?)(?:href([\\s\\n]*)?=(?:['\"\"\\s\\n]*)?)([a-zA-Z:#\\/._\\-0-9!?=^+]*(\\([\"\"'a-zA-Z\\s.()0-9]*\\))?)(?:[\\s\\na-zA-Z=\"\"()0-9]*.*?)?(?:\\>)");


        String input = sc.nextLine();
        String all = "";
        while (!input.equals("END")){
            all += input;
            input = sc.nextLine();
        }

        Matcher matcher = patt.matcher(all);
        while (matcher.find()){
            if (!matcher.group(2).equals("fake")) {
                System.out.println(matcher.group(2));
            }
        }
    }
}
