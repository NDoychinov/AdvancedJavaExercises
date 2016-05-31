package Ex3_StringsAndTextProcessing;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Niki on 19.5.2016 г..
 */
public class Problem4_ConvertFromBase10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int toBase = sc.nextInt();
        String num = sc.nextLine().trim();
        BigInteger number = new BigInteger(num);
        System.out.println(number.toString(toBase));
    }
}
