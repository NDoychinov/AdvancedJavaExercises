package Ex4_RegularExpressions;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Niki on 21.5.2016 г..
 */
public class Problem5_ValidUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> validUsers = new Stack<>();
        String[] inputUsers = sc.nextLine().trim().split("[\\s\\\\/()]+");

        Pattern patt = Pattern.compile("^([a-zA-Z][a-zA-Z0-9_]+)$");

        for (int i = 0; i < inputUsers.length; i++) {
            Matcher matcher = patt.matcher(inputUsers[i].trim());

            if (matcher.find()){
                String user = matcher.group(1);
                if (user.length() > 2 && user.length() < 26){
                    validUsers.add(user);
                }
            }
        }

        String[] twoBiggest = new String[2];
        int size = validUsers.size();
        long biggestCount = 0;
        for (int i = 0; i < size - 1; i++) {
            String first = validUsers.pop();
            String second = validUsers.peek();

            if (first.length() + second.length() >= biggestCount){
                biggestCount = first.length() + second.length();
                twoBiggest[0] = first;
                twoBiggest[1] = second;
            }
        }
        System.out.println(twoBiggest[1]);
        System.out.println(twoBiggest[0]);
        
    }
}
