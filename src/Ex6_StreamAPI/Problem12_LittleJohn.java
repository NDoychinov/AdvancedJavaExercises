package Ex6_StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Niki on 31.5.2016 г..
 */
public class Problem12_LittleJohn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> arrowTypes = new ArrayList<>();
        arrowTypes.add(">----->");
        arrowTypes.add(">>----->");
        arrowTypes.add(">>>----->>");

        int smallCount = 0;
        int mediumCount = 0;
        int largeCount = 0;


        for (int i = 0; i < 4; i++) {
            String input = sc.nextLine();

            while (input.indexOf(arrowTypes.get(2)) != -1){
                largeCount++;
                input = input.replaceFirst(arrowTypes.get(2), " ");
            }
            while (input.indexOf(arrowTypes.get(1)) != -1){
                mediumCount++;
                input = input.replaceFirst(arrowTypes.get(1), " ");
            }
            while (input.indexOf(arrowTypes.get(0)) != -1){
                smallCount++;
                input = input.replaceFirst(arrowTypes.get(0), " ");
            }
        }
        int number = Integer.parseInt(String.format("%s%s%s", smallCount, mediumCount, largeCount));
        StringBuilder binary = new StringBuilder(Integer.toBinaryString(number));
        StringBuilder reversed = new StringBuilder(binary).reverse();
        int finalNumber = Integer.parseInt(binary.append(reversed).toString(), 2);

        System.out.println(finalNumber);
    }
}