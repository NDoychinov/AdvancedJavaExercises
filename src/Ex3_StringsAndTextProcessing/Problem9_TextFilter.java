package Ex3_StringsAndTextProcessing;

import java.util.Scanner;

/**
 * Created by Niki on 19.5.2016 г..
 */
public class Problem9_TextFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] banned = sc.nextLine().trim().split(", ");
        String text = sc.nextLine();

        for (int i = 0; i < banned.length; i++) {
            String replacement = "";
            for (int j = 0; j < banned[i].length(); j++) {
                replacement += "*";
            }
            text = text.replaceAll(banned[i], replacement);
        }
        System.out.println(text);
    }
}
