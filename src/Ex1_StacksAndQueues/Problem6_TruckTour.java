package Ex1_StacksAndQueues;

import java.util.Scanner;

/**
 * Created by Niki on 17.5.2016 г..
 */
public class Problem6_TruckTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] petrol = new int[n];
        int[] distance = new int[n];

        for (int i = 0; i < n; i++) {
            petrol[i] = sc.nextInt();
            distance[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            int totalPetrol = 0;
            boolean check = true;
            for (int j = i; j < n + i; j++) {
                if (totalPetrol < 0){
                    check = false;
                    break;
                }
                totalPetrol += petrol[j % n];
                totalPetrol -= distance[j % n];
            }
            if (totalPetrol < 0){
                check = false;
            }
            if (check){
                System.out.println(i);
                break;
            }
        }
    }
}
