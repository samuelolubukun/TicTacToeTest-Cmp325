package test;

import main.TicTacToe;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeTest {

    private TicTacToe ticTacToe;

    @Before
    public void setUp() {
        ticTacToe = new TicTacToe();
    }

    @Test
    public void testCheckWinNoWin() {
        char[][] board = {
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'O', 'X', 'O'}
        };
        ticTacToe = new TicTacToe();
        ticTacToe.board = board;
        char result = ticTacToe.checkWin();
        assertEquals(' ', result);
    }

    @Test
    public void testCheckWinHorizontalWin() {
        char[][] board = {
                {'X', 'X', 'X'},
                {'O', 'O', ' '},
                {' ', ' ', 'O'}
        };
        ticTacToe = new TicTacToe();
        ticTacToe.board = board;
        char result = ticTacToe.checkWin();
        assertEquals('X', result);
    }

    @Test
    public void testCheckWinVerticalWin() {
        char[][] board = {
                {'X', 'O', 'X'},
                {'X', 'O', ' '},
                {'X', ' ', 'O'}
        };
        ticTacToe = new TicTacToe();
        ticTacToe.board = board;
        char result = ticTacToe.checkWin();
        assertEquals('X', result);
    }

    @Test
    public void testCheckWinDiagonalWin1() {
        char[][] board = {
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'O', ' ', 'X'}
        };
        ticTacToe = new TicTacToe();
        ticTacToe.board = board;
        char result = ticTacToe.checkWin();
        assertEquals('X', result);
    }

    @Test
    public void testCheckWinDiagonalWin2() {
        char[][] board = {
                {'O', 'O', 'X'},
                {'O', 'X', 'O'},
                {'X', ' ', 'O'}
        };
        ticTacToe = new TicTacToe();
        ticTacToe.board = board;
        char result = ticTacToe.checkWin();
        assertEquals('X', result);
    }

    @Test
    public void testCheckWinDraw() {
        char[][] board = {
                {'X', 'O', 'X'},
                {'X', 'O', 'O'},
                {'O', 'X', 'X'}
        };
        ticTacToe = new TicTacToe();
        ticTacToe.board = board;
        char result = ticTacToe.checkWin();
        assertEquals(' ', result);
    }

    @Test
    public void testIsDraw() {
        char[][] board = {
                {'X', 'O', 'X'},
                {'X', 'O', 'O'},
                {'O', 'X', 'X'}
        };
        ticTacToe = new TicTacToe();
        ticTacToe.board = board;
        boolean result = ticTacToe.isDraw();
        assertTrue(result);
    }

    @Test
    public void testReset() {
        char[][] board = {
                {'X', 'O', 'X'},
                {'X', 'O', 'O'},
                {'O', 'X', 'X'}
        };
        ticTacToe = new TicTacToe();
        ticTacToe.board = board;
        ticTacToe.reset();
        char[][] resetBoard = ticTacToe.getBoard();
        char currentPlayer = ticTacToe.getCurrentPlayer();

        char[][] expectedBoard = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        char expectedCurrentPlayer = 'X';

        assertArrayEquals(expectedBoard, resetBoard);
        assertEquals(expectedCurrentPlayer, currentPlayer);
    }
}
