package Ex4_RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Niki on 22.5.2016 г..
 */
public class Problem8_UseYourChainsBuddy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern patt = Pattern.compile("<p>(.*?)<\\/p>");

        String input = sc.nextLine();

        Matcher matcher = patt.matcher(input);
        String extractedMsg = "";
        while (matcher.find()) {
            extractedMsg += matcher.group(1);
        }

        String decriptedMsg = "";
        for (int i = 0; i < extractedMsg.length(); i++) {
            if (extractedMsg.charAt(i) >= 97 && extractedMsg.charAt(i) <= 122) {
                int currChar = extractedMsg.charAt(i);

                if (currChar < 110) {
                    currChar += 13;
                } else {
                    currChar -= 13;
                }
                decriptedMsg += (char)currChar;

            } else if (extractedMsg.charAt(i) >= 48 && extractedMsg.charAt(i) <= 57) {
                decriptedMsg += extractedMsg.charAt(i);
            } else {
                decriptedMsg += " ";
            }
        }
        System.out.println(decriptedMsg.replaceAll("  +", " "));
    }
}
