package main.UI;

import main.TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeUI extends JFrame {
    private TicTacToe game;
    private JButton[][] buttons;

    public TicTacToeUI() {
        game = new TicTacToe();
        buttons = new JButton[3][3];
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Tic-Tac-Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new GridLayout(3, 3));

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col] = new JButton();
                buttons[row][col].setFont(new Font("Arial", Font.PLAIN, 48));
                buttons[row][col].addActionListener(new ButtonClickListener(row, col));
                add(buttons[row][col]);
            }
        }

        setVisible(true);
    }

    private void updateUI() {
        char[][] board = game.getBoard();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col].setText(String.valueOf(board[row][col]));
                buttons[row][col].setEnabled(board[row][col] == ' ');
            }
        }
    }

    private class ButtonClickListener implements ActionListener {
        private int row;
        private int col;

        public ButtonClickListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (game.checkWin() == ' ' && !game.isDraw()) {
                game.makeMove(row, col);

                char winner = game.checkWin();
                if (winner != ' ') {
                    displayWinner(winner);
                } else {
                    updateUI(); // Update the UI after the move
                    if (game.isDraw()) {
                        displayDraw();
                    }
                }
            }
        }
    }


    private void displayWinner(char winner) {
        JOptionPane.showMessageDialog(null, "Player " + winner + " wins!");
        resetBoard();
    }

    private void displayDraw() {
        JOptionPane.showMessageDialog(null, "It's a draw!");
        resetBoard();
    }

    private void resetBoard() {
        game.reset();
        updateUI();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TicTacToeUI();
        });
    }
}
