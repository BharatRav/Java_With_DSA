package DynamicProgramming.Letcode;
//Leetcode Link:-https://leetcode.com/problems/minimum-falling-path-sum/description/

public class MinimumFallingPathSum {
    public int minFallingPathSum(int[][] matrix) {

        int n = matrix.length;
        if (n == 1)  return matrix[0][0];   //if length is 1

        int[][] dp = new int[n][n+2];       //2 extra column for column 0 and column n+1 with max value

        //initialization
        for (int row =0;row<n;row++) {
            dp[row][0] = dp[row][n+1] = Integer.MAX_VALUE;
        }
        for (int col=1;col<=n;col++) {
            dp[0][col] = matrix[0][col-1];
        }

        //aproach is simple i will be at a cell and heck what was the smallest value in 3 of parent, only take that

        //lastly in last row take minimum in the last row which is my answer

        for (int row=1;row<n;row++) {
            for (int col=1;col<=n;col++) {
                dp[row][col] = Math.min(dp[row-1][col-1],Math.min(dp[row-1][col],dp[row-1][col+1])) +matrix[row][col-1];
            }
        }

        int result =dp[n-1][1]; //assumig first one is minimum  i'm not taking Integer.maxValue
        for (int i=1;i<=n;i++) {    //ignoring 0th and n+1th column
            result = Math.min(result,dp[n-1][i]);
        }
        return result;
    }
}

