package Ex6_StreamAPI;

import java.util.*;

/**
 * Created by Niki on 31.5.2016 г..
 */
public class Problem11_StudentsJoinedToSpecialties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, LinkedHashMap<String, String>> speciality = new HashMap<>();
        List<String> result = new ArrayList<>();
        String input = sc.nextLine();

        while (!input.equals("Students:")) {
            String[] data = input.split("\\s+");
            if (!speciality.containsKey(data[2])) {
                speciality.put(data[2], new LinkedHashMap<>());
            }
            speciality.get(data[2]).put(data[0] + " " + data[1], "uninitialized");

            input = sc.nextLine();
        }

        input = sc.nextLine();
        while (!input.equals("END")) {
            String[] data = input.split("\\s+");
            if (speciality.containsKey(data[0])) {
                LinkedHashMap<String, String> students = speciality.get(data[0]);
                for (Map.Entry<String, String> entry : students.entrySet()) {
                   students.put(entry.getKey(), data[1] + " " + data[2]);
                }
                speciality.put(data[0], students);
            }

            input = sc.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, String>> entrys : speciality.entrySet()) {
            HashMap<String, String> students = speciality.get(entrys.getKey());
            for (Map.Entry<String, String> stringStringEntry : students.entrySet()) {
                String currStudent =  stringStringEntry.getValue() + " " + entrys.getKey() + " " +  stringStringEntry.getKey();
                if (!stringStringEntry.getValue().equals("uninitialized")){
                    result.add(currStudent);
                }
            }
        }

        Collections.sort(result, (s1, s2) -> (s1.split(" ")[0] + s1.split(" ")[1]).compareTo(s2.split(" ")[0] + s2.split(" ")[1]));
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
