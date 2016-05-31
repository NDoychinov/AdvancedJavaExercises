package Ex3_StringsAndTextProcessing;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Niki on 19.5.2016 г..
 */
public class Problem5_ConvertFromBaseN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int toBase = sc.nextInt();
        String num = sc.nextLine().trim();
        System.out.println(new BigInteger(num, toBase));
    }
}
