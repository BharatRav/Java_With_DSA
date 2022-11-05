package Arrays.Leetcode;



public class SudokuSolver {

    public void solveSudoku(char[][] board) {
        solvedSudoku(board);
    }
    private boolean solvedSudoku(char[][] board) {
        for(int i=0;i<board.length;i++) {
            for (int j=0;j<board[0].length;j++) {
                if (board[i][j] == '.') {
                    for (int numberToTry = 1; numberToTry <= board.length; numberToTry++) {
                        if (isValidPlacement(board, numberToTry, i, j)) {
                            board[i][j] = (char) (numberToTry + '0');
                            if (solvedSudoku(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }


    private  boolean isNumberInRow(char[][] board,int number, int row) {
        for(int j =0;j<board[0].length;j++) {
            if (board[row][j]==(number+'0')) {
                return true;
            }
        }
        return false;
    }
    private boolean isNumberInColumn (char[][] board, int number, int column) {
        for (int i=0;i<board.length;i++) {
            if(board[i][column]==(number+'0')) {
                return true;
            }
        }
        return false;
    }
    private boolean isNumberInBox (char[][] board, int number ,int row, int column) {
        int rowStart = row-row%3;
        int columnStart = column- column%3;
        for (int i =rowStart;i<rowStart+3;i++) {
            for (int j =columnStart;j<columnStart+3;j++) {
                if(board[i][j] == (number+'0')) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isValidPlacement(char[][] board,int number, int row, int column) {
        return !isNumberInRow(board,number,row) && !isNumberInColumn(board,number,column)
                && !isNumberInBox(board,number,row,column);
    }



}
/*
A sudoku solution must satisfy all of the following rules:

Each of the digits 1-9 must occur exactly once in each row.
Each of the digits 1-9 must occur exactly once in each column.
Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
The '.' character indicates empty cells.
 */
