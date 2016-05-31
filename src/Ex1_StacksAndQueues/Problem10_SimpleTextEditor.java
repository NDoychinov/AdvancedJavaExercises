package Ex1_StacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Niki on 17.5.2016 г..
 */
public class Problem10_SimpleTextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<String> copies = new Stack<>();
        String word = "";
        for (int i = 0; i < n; i++) {
            int comm = sc.nextInt();

            if (comm == 1){
                String input = sc.nextLine().trim();

                copies.add(word);
                word += input;
            }else if (comm == 2){
                int input = sc.nextInt();

                copies.add(word);
                word = word.substring(0, word.length() - input);
            }else if (comm == 3){
                int input = sc.nextInt();
                System.out.println(word.charAt(input - 1));
            }else if (comm == 4){
                if (copies.size() > 0) {
                    word = copies.pop();
                }else {
                    word = "";
                }
            }
        }
    }
}
