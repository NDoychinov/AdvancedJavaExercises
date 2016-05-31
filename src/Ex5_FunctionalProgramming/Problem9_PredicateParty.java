package Ex5_FunctionalProgramming;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Niki on 22.5.2016 г..
 */
public class Problem9_PredicateParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namesLine = sc.nextLine().trim();
        if (namesLine.length() > 0) {
            LinkedList<String> names = new LinkedList<>(Arrays.asList(namesLine.split("\\s+")));
            String input = sc.nextLine().trim();

            while (!input.equals("Party!")) {
                String[] commands = input.split("\\s+");

                String action = commands[0];
                String secondAction = commands[1];
                String part = commands[2];
                int partNum = -1;
                try {
                    partNum = Integer.parseInt(commands[2]);
                } catch (Exception e) {

                }

                if (action.equals("Remove")) {
                    if (secondAction.equals("StartsWith")) {
                        for (int i = 0; i < names.size(); i++) {
                            if (names.get(i).indexOf(part) == 0) {
                                names.remove(i);
                                i--;
                            }
                        }
                    } else if (secondAction.equals("Length")) {
                        for (int i = 0; i < names.size(); i++) {
                            if (names.get(i).length() == partNum) {
                                names.remove(i);
                                i--;
                            }
                        }
                    } else {
                        for (int i = 0; i < names.size(); i++) {
                            if (names.get(i).lastIndexOf(part) != -1 &&
                                    names.get(i).lastIndexOf(part) == names.get(i).length() - part.length()) {
                                names.remove(i);
                                i--;
                            }
                        }
                    }
                } else {
                    if (secondAction.equals("StartsWith")) {
                        for (int i = 0; i < names.size(); i++) {
                            if (names.get(i).indexOf(part) == 0) {
                                names.add(i, names.get(i));
                                i++;
                            }
                        }
                    } else if (secondAction.equals("Length")) {
                        for (int i = 0; i < names.size(); i++) {
                            if (names.get(i).length() == partNum) {
                                names.add(i, names.get(i));
                                i++;
                            }
                        }
                    } else {
                        for (int i = 0; i < names.size(); i++) {
                            if (names.get(i).lastIndexOf(part) != -1 &&
                                    names.get(i).lastIndexOf(part) == names.get(i).length() - part.length()) {
                                names.add(i, names.get(i));
                                i++;
                            }
                        }
                    }
                }
                input = sc.nextLine().trim();
            }
            if (names.size() > 0) {
                System.out.printf("%s are going to the party!", names.toString().replace("[", "").replace("]", ""));
            } else {
                System.out.println("Nobody is going to the party!");
            }
        } else {
            System.out.println("Nobody is going to the party!");
        }
    }
}
