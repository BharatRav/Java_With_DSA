package DynamicProgramming.Letcode;
//Leetcode Link:-https://leetcode.com/problems/n-th-tribonacci-number/?envType=study-plan&id=dynamic-programming-i
public class NthTribonacciNumber {
    public int tribonacci(int n) {
        if (n<=1) {
            return n;
        }
        if (n==2) {
            return 1;
        }
        int[] dp = new int[n+1];
        dp[1] =1;
        dp[2] =1;
        for (int i=3;i<=n;i++) {
            dp[i]= dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];

    }
}
