package Ex2_SetsAndMaps;

import java.util.Scanner;

/**
 * Created by Niki on 19.5.2016 г..
 */
public class Problem18_RadioactiveBunnies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine();

        char[][] matrix = new char[rows][cols];
        int[] playerPoss = new int[2];

        for (int i = 0; i < rows; i++) {
            String line = sc.nextLine().trim();

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = line.charAt(j);
                if (line.charAt(j) == 'P') {
                    playerPoss[0] = i;
                    playerPoss[1] = j;
                }
            }
        }

        String commands = sc.nextLine().trim();

        boolean escaped = false;
        boolean dead = false;
        for (int i = 0; i < commands.length(); i++) {
            char command = commands.charAt(i);
            int playerRow = playerPoss[0];
            int playerCol = playerPoss[1];

            if (command == 'L') {
                if (IsInMatrix(matrix, playerRow, playerCol - 1) && matrix[playerRow][playerCol - 1] == 'B'){
                    dead = true;
                    playerPoss[1] = playerCol - 1;
                }
                if (IsInMatrix(matrix, playerRow, playerCol - 1) && !dead) {
                    matrix[playerRow][playerCol - 1] = 'P';
                    matrix[playerRow][playerCol] = '.';
                    playerPoss[1] = playerCol - 1;
                } else if (!IsInMatrix(matrix, playerRow, playerCol - 1)){
                    escaped = true;
                    matrix[playerRow][playerCol] = '.';
                }
            } else if (command == 'R') {
                if (IsInMatrix(matrix, playerRow, playerCol + 1) && matrix[playerRow][playerCol + 1] == 'B'){
                    dead = true;
                    playerPoss[1] = playerCol + 1;
                }
                if (IsInMatrix(matrix, playerRow, playerCol + 1) && !dead) {
                    matrix[playerRow][playerCol + 1] = 'P';
                    matrix[playerRow][playerCol] = '.';
                    playerPoss[1] = playerCol + 1;
                } else if (!IsInMatrix(matrix, playerRow, playerCol + 1)){
                    escaped = true;
                    matrix[playerRow][playerCol] = '.';
                }
            } else if (command == 'U') {
                if (IsInMatrix(matrix, playerRow - 1, playerCol) && matrix[playerRow - 1][playerCol] == 'B'){
                    dead = true;
                    playerPoss[0] = playerRow - 1;
                }
                if (IsInMatrix(matrix, playerRow - 1, playerCol) && !dead) {
                    matrix[playerRow - 1][playerCol] = 'P';
                    matrix[playerRow][playerCol] = '.';
                    playerPoss[0] = playerRow - 1;
                } else if (!IsInMatrix(matrix, playerRow, playerCol - 1)){
                    escaped = true;
                    matrix[playerRow][playerCol] = '.';
                }
            } else if (command == 'D') {
                if (IsInMatrix(matrix, playerRow + 1, playerCol) && matrix[playerRow + 1][playerCol] == 'B'){
                    dead = true;
                    playerPoss[0] = playerRow + 1;
                }
                if (IsInMatrix(matrix, playerRow + 1, playerCol) && !dead) {
                    matrix[playerRow + 1][playerCol] = 'P';
                    matrix[playerRow][playerCol] = '.';
                    playerPoss[0] = playerRow + 1;
                } else if (!IsInMatrix(matrix, playerRow + 1, playerCol)){
                    escaped = true;
                    matrix[playerRow][playerCol] = '.';
                }
            }


            char[][] clone = new char[rows][cols];
            for(int v = 0; v < matrix.length; v++) {
                clone[v] = matrix[v].clone();
            }

            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix[j].length; k++) {
                    if (clone[j][k] == 'B'){
                        if (IsInMatrix(matrix, j, k + 1)){
                            if (matrix[j][k + 1] == 'P'){
                                dead = true;
                            }
                            matrix[j][k + 1] = 'B';
                        }
                        if (IsInMatrix(matrix, j, k - 1)){
                            if (matrix[j][k - 1] == 'P'){
                                dead = true;
                            }
                            matrix[j][k - 1] = 'B';
                        }
                        if (IsInMatrix(matrix, j + 1, k)){
                            if (matrix[j + 1][k] == 'P'){
                                dead = true;
                            }
                            matrix[j + 1][k] = 'B';
                        }
                        if (IsInMatrix(matrix, j - 1, k)){
                            if (matrix[j - 1][k] == 'P'){
                                dead = true;
                            }
                            matrix[j - 1][k] = 'B';
                        }
                    }
                }
            }

            if (escaped || dead){
                break;
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%s", matrix[i][j]);
            }
            System.out.println();
        }
        if (escaped){
            System.out.printf("won: %d %d", playerPoss[0], playerPoss[1]);
        } else {
            System.out.printf("dead: %d %d", playerPoss[0], playerPoss[1]);
        }
    }

    public static boolean IsInMatrix(char matrix[][], int row, int col) {
        if ((matrix.length > row && row >= 0) && (matrix[row].length > col && col >= 0)) {
            return true;
        } else {
            return false;
        }
    }
}
