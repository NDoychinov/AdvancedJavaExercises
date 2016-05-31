package Ex3_StringsAndTextProcessing;

import java.util.Scanner;

/**
 * Created by Niki on 19.5.2016 г..
 */
public class Problem7_SumBigNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.nextLine().trim();
        String num2 = sc.nextLine().trim();
        
        if (num1.length() > num2.length()){
            int lenght = num1.length() - num2.length();
            for (int i = 0; i < lenght; i++) {
                num2 = "0" + num2;
            }
        } else {
            int lenght = num2.length() - num1.length();
            for (int i = 0; i < lenght; i++) {
                num1 = "0" + num1;
            }
        }

        int rest = 0;
        String result = "";
        for (int i = num1.length() - 1; i >= 0; i--) {
            result = ((num1.charAt(i) - '0') + (num2.charAt(i) - '0') + rest) % 10 + result;
            rest = ((num1.charAt(i) - '0') + (num2.charAt(i) - '0') + rest) / 10;
        }
        if (rest != 0) {
            System.out.printf("" + rest);
        }
        System.out.println(result);
    }
}
