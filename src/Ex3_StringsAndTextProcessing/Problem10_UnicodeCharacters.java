package Ex3_StringsAndTextProcessing;

import java.util.Scanner;

/**
 * Created by Niki on 20.5.2016 г..
 */
public class Problem10_UnicodeCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            System.out.printf( "\\u" + Integer.toHexString(word.charAt(i) | 0x10000).substring(1));
        }
    }
}
