package main;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the current state of the board
            char[][] board = game.getBoard();
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    System.out.print(board[row][col] + " ");
                }
                System.out.println();
            }

            // Get the current player's input
            char currentPlayer = game.getCurrentPlayer();
            System.out.print("Player " + currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // Make the move
            game.makeMove(row, col);

            // Check for a win
            char winner = game.checkWin();
            if (winner != ' ') {
                System.out.println("Player " + winner + " wins!");

                // If 'X' has won, print the winning combination
                if (winner == 'X') {
                    System.out.println("Winning Combination for 'X':");
                    for (int r = 0; r < 3; r++) {
                        for (int c = 0; c < 3; c++) {
                            if (board[r][c] == 'X') {
                                System.out.println("Row: " + r + ", Column: " + c);
                            }
                        }
                    }
                }

                break;
            } else if (game.isDraw()) {
                System.out.println("It's a draw!");
                break;
            }
        }

        scanner.close();
    }
}
