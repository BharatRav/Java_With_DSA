package DynamicProgramming.Letcode;
//Leetcode Link:-https://leetcode.com/problems/minimum-path-sum/
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        //mXn matrix
        int m = grid.length;
        int n = grid[0].length;

        //initialization
        //first(0th) column
        for (int i=1;i<m;i++) {
            grid[i][0] += grid[i-1][0];
        }

        //first row(0th)
        for (int j=1;j<n;j++) {
            grid[0][j] += grid[0][j-1];
        }

        //logic part
        for (int row=1;row<m;row++) {
            for (int col=1;col<n;col++) {
                grid[row][col] += Math.min(grid[row-1][col],grid[row][col-1]);
            }
        }
        return grid[m-1][n-1];
    }
}
