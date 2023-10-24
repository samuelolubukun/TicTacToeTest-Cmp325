# TicTacToeTest-Cmp325

# TicTacToe Test README

## Overview
This README provides an overview of the JUnit test class `TicTacToeTest` for the `TicTacToe` class. The `TicTacToe` class represents a Tic-Tac-Toe game, and `TicTacToeTest` contains a set of unit tests to verify the functionality of the `TicTacToe` class, including checking for wins, draws, and resetting the game.

## Test Cases

![Screenshot (71)](https://github.com/samuelolubukun/TicTacToeTest-Cmp325/assets/132141300/4cd4a60e-ff5a-49a0-8243-f1f89dc93cba)

### `testCheckWinNoWin`
This test verifies that the `checkWin` method correctly identifies no win on the game board when there is no winning condition present.

### `testCheckWinHorizontalWin`
This test checks if the `checkWin` method correctly identifies a horizontal win on the game board.

### `testCheckWinVerticalWin`
This test verifies that the `checkWin` method correctly identifies a vertical win on the game board.

### `testCheckWinDiagonalWin1`
This test checks if the `checkWin` method correctly identifies a diagonal win from the top left to bottom right.

### `testCheckWinDiagonalWin2`
This test verifies that the `checkWin` method correctly identifies a diagonal win from the top right to bottom left.

### `testCheckWinDraw`
This test ensures that the `checkWin` method correctly identifies a draw when no player has won, and the board is full.

### `testIsDraw`
This test checks the `isDraw` method to confirm that it correctly detects a draw when the game board is full, but no player has won.

### `testReset`
This test assesses the `reset` method, ensuring it resets the game board and sets the current player back to 'X'.

## Running the Tests
To run these tests, ensure you have JUnit set up in your development environment and execute the `TicTacToeTest` class. These tests will help validate the functionality of the `TicTacToe` class for a complete Tic-Tac-Toe game simulation.

Feel free to use this test suite to validate the correctness of your `TicTacToe` implementation.


