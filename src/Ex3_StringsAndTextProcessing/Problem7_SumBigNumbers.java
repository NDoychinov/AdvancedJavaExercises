package Ex3_StringsAndTextProcessing;

import java.util.Scanner;

/**
 * Created by Niki on 19.5.2016 г..
 */
public class Problem7_SumBigNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder num1 = new StringBuilder(sc.nextLine().trim());
        StringBuilder num2 = new StringBuilder(sc.nextLine().trim());
        
        if (num1.length() > num2.length()){
            int lenght = num1.length() - num2.length();
            for (int i = 0; i < lenght; i++) {
                num2 = new StringBuilder("0" + num2);
            }
        } else {
            int lenght = num2.length() - num1.length();
            for (int i = 0; i < lenght; i++) {
                num1 = new StringBuilder("0" + num1);
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

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '0'){
                result = result.substring(i + 1, result.length());
            } else {
                break;
            }
        }

        System.out.println(result);
    }
}
