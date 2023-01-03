package DynamicProgramming.Letcode;
//Leetcode Link:-https://leetcode.com/problems/min-cost-climbing-stairs/?envType=study-plan&id=dynamic-programming-i
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int len =cost.length;
        int[] dp = new int[len+1];
        dp[1] =cost[0];
        dp[2] = cost[1];

        for (int i=3;i<=len;i++) {
            dp[i] =Math.min((dp[i-1]),(dp[i-2]))+cost[i-1];
        }

        return Math.min(dp[len],dp[len-1]);
    }

    //method 2  S(n) =O(1)
//    public int minCostClimbingStairs(int[] cost) {
//        for (int i = 2; i < cost.length; i++) {
//            cost[i] += Math.min(cost[i-1], cost[i-2]);
//        }
//        return Math.min(cost[cost.length-1], cost[cost.length-2]);
//    }
}
/*
Constraints:

2 <= cost.length <= 1000
0 <= cost[i] <= 999
 */
