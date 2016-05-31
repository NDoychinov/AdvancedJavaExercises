package Ex5_FunctionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Niki on 24.5.2016 г..
 */
public class Problem11_InfernoIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String[]> exclusions = new LinkedList<>();

        String gemsLine = sc.nextLine().trim();
        if (gemsLine.length() > 0) {
            LinkedList<Integer> gems = new LinkedList<>(Arrays.asList(gemsLine.split("\\s+")).stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList()));

            String input = sc.nextLine().trim();

            while (!input.equals("Forge")) {
                String[] commands = input.split(";+");
                if (commands[0].equals("Exclude")) {
                    exclusions.add(new String[2]);
                    exclusions.get(exclusions.size() - 1)[0] = commands[1].trim();
                    exclusions.get(exclusions.size() - 1)[1] = commands[2].trim();
                } else {
                    for (int i = 0; i < exclusions.size(); i++) {
                        if (exclusions.get(i)[0].equals(commands[1]) && exclusions.get(i)[1].equals(commands[2])){
                            exclusions.remove(i);
                            break;
                        }
                    }
                }

                input = sc.nextLine().trim();
            }

            List<Integer> marked = new ArrayList<>();
            for (int i = 0; i < exclusions.size(); i++) {
                if (exclusions.get(i)[0].equals("Sum Left")) {
                    int parameter = Integer.parseInt(exclusions.get(i)[1]);
                    int prevValue = 0;
                    for (int j = 0; j < gems.size(); j++) {
                        if (gems.get(j) + prevValue == parameter) {
                            marked.add(j);
                        }
                        prevValue = gems.get(j);
                    }
                }  else if (exclusions.get(i)[0].equals("Sum Left Right")) {
                    int parameter = Integer.parseInt(exclusions.get(i)[1]);
                    int nextValue;
                    int prevValue = 0;
                    try {
                        nextValue = gems.get(1);
                    } catch (Exception e) {
                        nextValue = 0;
                    }

                    for (int j = 0; j < gems.size(); j++) {
                        if (gems.get(j) + nextValue + prevValue == parameter) {
                            marked.add(j);
                        }

                        try {
                            nextValue = gems.get(j + 2);
                        } catch (Exception e) {
                            nextValue = 0;
                        }
                        prevValue = gems.get(j);
                    }
                } else  {
                    int parameter = Integer.parseInt(exclusions.get(i)[1]);
                    int nextValue;
                    try {
                        nextValue = gems.get(1);
                    } catch (Exception e) {
                        nextValue = 0;
                    }

                    for (int j = 0; j < gems.size(); j++) {
                        if (gems.get(j) + nextValue == parameter) {
                            marked.add(j);
                        }

                        try {
                            nextValue = gems.get(j + 2);
                        } catch (Exception e) {
                            nextValue = 0;
                        }
                    }
                }
            }

            for (int i = 0; i < gems.size(); i++) {
                if (!marked.contains(i)) {
                    System.out.printf("%d ", gems.get(i));
                }
            }
        }
    }
}
