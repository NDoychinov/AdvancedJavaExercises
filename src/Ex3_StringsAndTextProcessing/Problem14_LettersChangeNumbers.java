package Ex3_StringsAndTextProcessing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Niki on 20.5.2016 г..
 */
public class Problem14_LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().trim();
        Pattern patt = Pattern.compile("([A-Z]|[a-z])([0-9]+)([A-Z]|[a-z])");
        Matcher matcher = patt.matcher(input);
        double sum = 0;
        while (matcher.find()) {
            char char1 = matcher.group(1).charAt(0);
            double num = Double.parseDouble(matcher.group(2));
            char char2 = matcher.group(3).charAt(0);

            if (char1 >= 97 && char1 <= 122) {
                sum += num * (char1 - 96);
            } else {
                sum += num / (char1 - 64);
            }


            if (char2 >= 97 && char2 <= 122) {
                sum += char2 - 96;
            } else {
                sum -= char2 - 64;
            }
        }
        System.out.printf("%.2f", sum);
    }
}
