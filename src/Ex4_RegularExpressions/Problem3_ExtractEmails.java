package Ex4_RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Niki on 20.5.2016 г..
 */
public class Problem3_ExtractEmails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile("\\s[a-zA-Z0-9]+[-._]*[A-Za-z0-9]*@([a-zA-Z]+[.-]*[a-zA-Z]+[.-]*[a-zA-Z]+)+\\.[a-zA-Z]+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group().trim());
        }
    }

}
