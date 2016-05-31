package Ex3_StringsAndTextProcessing;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Niki on 19.5.2016 г..
 */
public class Problem8_MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal num1 = sc.nextBigDecimal();
        BigDecimal num2 = sc.nextBigDecimal();
        System.out.println(num1.multiply(num2));
    }
}
