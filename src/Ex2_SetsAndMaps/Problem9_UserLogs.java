package Ex2_SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Niki on 18.5.2016 г..
 */
public class Problem9_UserLogs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeMap<String, LinkedHashMap<String, Integer>> data = new TreeMap<>();
        Pattern patt = Pattern.compile("IP=(.*) message='.*' user=(.*)");
        String input = sc.nextLine();

        while (!input.equals("end")){
            Matcher matcher = patt.matcher(input);
            matcher.find();
            String ip = matcher.group(1);
            String user = matcher.group(2);
            
            if (!data.containsKey(user)){
                data.put(user, new LinkedHashMap<>());
                data.get(user).put(ip, 1);
            } else if (!data.get(user).containsKey(ip)){
                data.get(user).put(ip, 1);
            } else {
                data.get(user).put(ip, data.get(user).get(ip) + 1);
            }
            
            input = sc.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> entrys : data.entrySet()) {
            System.out.println(entrys.getKey() + ":");
            String out = "";
            for (Map.Entry<String,Integer> ips : entrys.getValue().entrySet()) {
                out += String.format("%s => %d, ", ips.getKey(), ips.getValue());
            }
            out = out.substring(0, out.length() - 2) + ".";
            System.out.println(out);
        }
    }
}
