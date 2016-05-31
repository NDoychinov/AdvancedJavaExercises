package Ex5_FunctionalProgramming;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Niki on 24.5.2016 г..
 */
public class Problem12_TriFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int neededSum = sc.nextInt();
        sc.nextLine();
        String namesLine = sc.nextLine().trim();

        if (namesLine.length() > 0) {
            LinkedList<String> names = new LinkedList<>(Arrays.asList(namesLine.split("\\s+")));


            for (int i = 0; i < names.size(); i++) {
                int sum = 0;
                for (int j = 0; j < names.get(i).length(); j++) {
                    sum += names.get(i).charAt(j);
                }
                if (sum >= neededSum){
                    System.out.println(names.get(i));
                    break;
                }
            }
        }
    }
}
