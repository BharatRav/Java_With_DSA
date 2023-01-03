package DynamicProgramming.Letcode;
//Leetcode Link:-https://leetcode.com/problems/climbing-stairs/?envType=study-plan&id=dynamic-programming-i
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n<=1) {
            return n;
        }
        int[] dp = new int[n+1];
        if (n>1) {
            dp[1] =1;
            dp[2] =2;
        }

        for (int i=3;i<=n;i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    //same method
    /*
    public int climbStairs(int n) {
        int arr[] = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        if (n >1)
        arr[2] = 2;

        for(int i=3;i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[n];
    }
     */
}
