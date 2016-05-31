package Ex4_RegularExpressions;

import java.util.Scanner;

/**
 * Created by Niki on 20.5.2016 г..
 */
public class Problem2_ReplaceTag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String result = "";

        while (!input.equals("end")) {
            input = input.replaceAll("<a", "[URL");
            input = input.replaceAll("<\\/a>", "[/URL]");
            result += input;

            input = sc.nextLine();
        }
        System.out.println(result);
    }
}