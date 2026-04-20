public class Uc1 {
        public static void main(String[] args) {

            // Step 1: Declare a 3x3 board
            char[][] board = new char[3][3];

            // Step 2: Initialize the board with '-'
            for (int i = 0; i < 3; i++) {          // Outer loop for rows
                for (int j = 0; j < 3; j++) {      // Inner loop for columns
                    board[i][j] = '-';
                }
            }

            // Step 3: Display the board
            System.out.println("Initial Tic-Tac-Toe Board:\n");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println(); // Move to next line after each row
            }
        }
    }