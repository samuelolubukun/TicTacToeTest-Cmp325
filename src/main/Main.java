package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Start a new game
            TicTacToe game = new TicTacToe();

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
                    break;
                } else if (game.isDraw()) {
                    System.out.println("It's a draw!");
                    break;
                }
            }

            // Ask if the players want to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                break; // Exit the game loop
            }
        }

        scanner.close();
    }
}
