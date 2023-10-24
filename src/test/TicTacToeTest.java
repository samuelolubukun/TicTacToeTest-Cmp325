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
    public void testCheckWinHorizontalWin() {
        char[][] board = {
                {'X', 'X', 'X'},
                {'O', 'O', ' '},
                {' ', ' ', 'O'}
        };
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
        ticTacToe.board = board;
        char result = ticTacToe.checkWin();
        assertEquals(' ', result);
    }

    @Test
    public void testReset() {
        char[][] board = {
                {'X', 'O', 'X'},
                {'X', 'O', 'O'},
                {'O', 'X', 'X'}
        };
        ticTacToe.board = board;
        ticTacToe.reset();
        char[][] resetBoard = ticTacToe.getBoard();
        char expectedCurrentPlayer = 'X';

        char[][] expectedBoard = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        assertArrayEquals(expectedBoard, resetBoard);
        assertEquals(expectedCurrentPlayer, ticTacToe.getCurrentPlayer());
    }

    @Test
    public void testIsDraw() {
        char[][] board = {
                {'X', 'O', 'X'},
                {'X', 'O', 'O'},
                {'O', 'X', 'X'}
        };
        ticTacToe.board = board;
        boolean result = ticTacToe.isDraw();
        assertTrue(result);
    }
}
