package Ex2_SetsAndMaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Niki on 19.5.2016 г..
 */
public class Problem17_LegoBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<List<Integer>> first = new ArrayList<>();
        List<List<Integer>> second = new ArrayList<>();
        String input;
        for (int i = 0; i < n; i++) {
            input = sc.nextLine().trim();
            String[] line = input.split("\\s+");
            first.add(new ArrayList<>());
            for (int j = 0; j < line.length; j++) {
                first.get(i).add(Integer.parseInt(line[j].trim()));
            }
            second.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            input = sc.nextLine().trim();
            String[] line = input.split("\\s+");
            for (int j = 0; j < line.length; j++) {
                second.get(i).add(Integer.parseInt(line[j].trim()));
            }
        }
        
        for (int i = 0; i < n; i++) {
            Collections.reverse(second.get(i));
        }

        int getSize = first.get(0).size() + second.get(0).size();
        boolean check = true;
        for (int i = 1; i < n; i++) {
            if (first.get(i).size() + second.get(i).size() != getSize){
                check = false;
                break;
            }
        }
        
        if (check){
            for (int i = 0; i < n; i++) {
                List<Integer> currLine = new ArrayList<>();

                for (int j = 0; j < first.get(i).size(); j++) {
                    currLine.add(first.get(i).get(j));
                }
                for (int j = 0; j < second.get(i).size(); j++) {
                    currLine.add(second.get(i).get(j));
                }
                System.out.println(currLine);
            }
        } else {
            int cells = 0;
            for (int i = 0; i < first.size(); i++) {
                cells += first.get(i).size();
            }
            for (int i = 0; i < second.size(); i++) {
                cells += second.get(i).size();
            }
            System.out.println("The total number of cells is: " + cells);
        }
    }
}
