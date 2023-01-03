package DynamicProgramming.Letcode;
//Leetcode Link:-https://leetcode.com/problems/fibonacci-number/?envType=study-plan&id=dynamic-programming-i
public class FibonacciNumber {
//    public int fib(int n) {
//        //0 1 1 2 3 5 8 13 21...
//        if (n<=1) {
//            return n;
//        }
//        int[] dp = new int[n+1];
//        dp[1] =1;
//        for (int i=2;i<=n;i++) {
//            dp[i] =dp[i-1]+dp[i-2];
//        }
//        return dp[n];
//    }
    //T(n) = O(n)
    //S(n) = O(n) memoization

    //method 2
    static int[] dp = new int[31];
    public int fib(int n) {
        if(n<=1) {
            return n;
        }
        if(dp[n]!=0) {
            return dp[n];
        }
        return dp[n] =fib(n-1)+fib(n-2);
    }
}
