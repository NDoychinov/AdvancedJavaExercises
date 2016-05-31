package Ex5_FunctionalProgramming;

import java.util.*;

/**
 * Created by Niki on 23.5.2016 г..
 */
public class Problem10_PartyReservationFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namesLine = sc.nextLine().trim();
        if (namesLine.length() > 0) {
            LinkedList<String> names = new LinkedList<>(Arrays.asList(namesLine.split("\\s+")));
            List<String> startsWith = new ArrayList<>();
            List<String> endsWith = new ArrayList<>();
            List<String> length = new ArrayList<>();
            List<String> contains = new ArrayList<>();

            String input = sc.nextLine().trim();

            while (!input.equals("Print")) {
                String[] commands = input.split(";");

                String action = commands[0].trim();
                String secondAction = commands[1].trim();
                String part = commands[2].trim();

                if (action.equals("Add filter")) {
                    if (secondAction.equals("Starts with")) {
                        startsWith.add(part);
                    } else if (secondAction.equals("Ends with")) {
                        endsWith.add(part);
                    } else if (secondAction.equals("Length")) {
                        length.add(part);
                    } else if (secondAction.equals("Contains")) {
                        contains.add(part);
                    }
                } else {
                    if (secondAction.equals("Starts with")) {
                        startsWith.remove(part);
                    } else if (secondAction.equals("Ends with")) {
                        endsWith.remove(part);
                    } else if (secondAction.equals("Length")) {
                        length.remove(part);
                    } else if (secondAction.equals("Contains")) {
                        contains.remove(part);
                    }
                }

                input = sc.nextLine().trim();
            }

            for (int i = 0; i < startsWith.size(); i++) {
                for (int j = 0; j < names.size(); j++) {
                    if (names.get(j).indexOf(startsWith.get(i)) == 0){
                        names.remove(j);
                        j--;
                    }
                }
            }

            for (int i = 0; i < endsWith.size(); i++) {
                for (int j = 0; j < names.size(); j++) {
                    if (names.get(j).lastIndexOf(endsWith.get(i)) != -1 &&
                            names.get(j).lastIndexOf(endsWith.get(i)) == names.get(j).length() - endsWith.get(i).length()) {
                        names.remove(j);
                        j--;
                    }
                }
            }

            for (int i = 0; i < length.size(); i++) {
                for (int j = 0; j < names.size(); j++) {
                    if (names.get(j).length() == Integer.parseInt(length.get(i))) {
                        names.remove(j);
                        j--;
                    }
                }
            }

            for (int i = 0; i < contains.size(); i++) {
                for (int j = 0; j < names.size(); j++) {
                    if (names.get(j).indexOf(contains.get(i)) > -1) {
                        names.remove(j);
                        j--;
                    }
                }
            }

            for (int i = 0; i < names.size(); i++) {
                System.out.printf("%s ", names.get(i));
            }
        }
    }
}
