package Ex3_StringsAndTextProcessing;

import java.util.Scanner;

/**
 * Created by Niki on 19.5.2016 г..
 */
public class Problem2_StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        if (input.length() < 20) {
            int lenght = 20 - input.length();
            for (int i = 0; i < lenght; i++) {
                input += "*";
            }
        } else {
            input = input.substring(0, 20);
        }
        System.out.println(input);
    }
}
