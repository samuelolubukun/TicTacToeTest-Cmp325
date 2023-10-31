# TicTacToeTest-Cmp325


## Overview
This README provides an overview of the JUnit test class `TicTacToeTest` for the `TicTacToe` class. The `TicTacToe` class represents a Tic-Tac-Toe game, and `TicTacToeTest` contains a set of unit tests to verify the functionality of the `TicTacToe` class, including checking for wins, draws, and resetting the game.

![Screenshot (71)](https://github.com/samuelolubukun/TicTacToeTest-Cmp325/assets/132141300/4cd4a60e-ff5a-49a0-8243-f1f89dc93cba)

How TDD was used in the code:

Writing Test Cases:

In the TicTacToeTest class, test cases have been written to test various functionalities of the TicTacToe class.
Each test case is annotated with @Test to indicate that it is a JUnit test.
setUp() Method:

The setUp() method is annotated with @Before. It is used to initialize the TicTacToe object before running each test case. This ensures that each test starts with a fresh instance of the game.



Test Cases:

Several test cases have been written to check different scenarios:
testCheckWinNoWin checks if the checkWin method correctly identifies that there is no winner on the board.
testCheckWinHorizontalWin, testCheckWinVerticalWin, and testCheckWinDiagonalWin1 check if the checkWin method correctly identifies wins in different directions.
testCheckWinDiagonalWin2 checks for another diagonal win.
testCheckWinDraw checks if the checkWin method correctly identifies a draw.
testIsDraw checks if the isDraw method correctly identifies a draw.
testReset checks if the reset method correctly resets the game state.


Assertions:

The assertEquals and assertTrue methods are used to compare the actual results of the TicTacToe methods with the expected results specified in the test cases. These assertions verify that the code behaves as intended.






GUI(Java Swing) Update:



![Screenshot (72)](https://github.com/samuelolubukun/TicTacToeTest-Cmp325/assets/132141300/f4812789-7c52-4dfe-aed5-47dac85371d0)
![Screenshot (73)](https://github.com/samuelolubukun/TicTacToeTest-Cmp325/assets/132141300/f4508149-53e6-4773-a35c-734f60f88d2c)
![Screenshot (74)](https://github.com/samuelolubukun/TicTacToeTest-Cmp325/assets/132141300/450a3431-4ad4-4ee0-aae7-0c7162816f95)


