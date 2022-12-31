package Arrays.Leetcode;

import java.util.HashSet;

//Leetcode Link:-https://leetcode.com/problems/valid-sudoku/
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> seen = new HashSet<>();
        for (int i=0;i< board.length;i++){
            for (int j=0;j<board[0].length;j++) {
                char ch = board[i][j];
                if (board[i][j] !='.') {
                    if(!seen.add(ch+" found in row "+i) ||
                    !seen.add(ch+" found in col "+ j) ||
                    !seen.add(ch+" found in box "+i/3+" "+j/3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
