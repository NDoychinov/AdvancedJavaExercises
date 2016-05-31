package Ex3_StringsAndTextProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Niki on 19.5.2016 г..
 */
public class Problem1_ReverseString {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            StringBuilder reversed = new StringBuilder(br.readLine());
            System.out.println(reversed.reverse());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
