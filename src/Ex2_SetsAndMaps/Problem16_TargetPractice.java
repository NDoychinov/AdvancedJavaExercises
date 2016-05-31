package Ex2_SetsAndMaps;

import java.util.Scanner;

/**
 * Created by Niki on 19.5.2016 г..
 */
public class Problem16_TargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine();
        String snake = sc.nextLine();
        int impactRow = sc.nextInt();
        int impactCol = sc.nextInt();
        int impactRadius = sc.nextInt();
        char[][] matrix = new char[rows][cols];

        int symbolCount = 0;
        int rowCount = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            if (rowCount % 2 == 0) {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    matrix[i][j] = snake.charAt(symbolCount % snake.length());
                    symbolCount++;
                }
            } else {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = snake.charAt(symbolCount % snake.length());
                    symbolCount++;
                }
            }
            rowCount++;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (Math.pow(impactRow - i, 2) + Math.pow(impactCol - j, 2) <= Math.pow(impactRadius, 2)) {
                    matrix[i][j] = ' ';
                }
            }
        }

        for (int time = 0; time < matrix.length; time++) {
            for (int i = 1; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == ' ') {
                        matrix[i][j] = matrix[i - 1][j];
                        matrix[i - 1][j] = ' ';
                    }
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%s", matrix[i][j]);
            }
            System.out.println();
        }

    }
}
