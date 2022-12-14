package DynamicProgramming.Letcode;
//Leetcode Link:- https://leetcode.com/problems/house-robber/description/
public class HouseRobber {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0],nums[1]);

        int[] dp = new  int[nums.length+1];

        dp[1] =nums[0];
//        dp[2] =nums[1];
        for (int i=2;i< nums.length+1;i++) {
            dp[i] =Math.max(Math.max(dp[i-1]-nums[i-2],dp[i-2])+nums[i-1],dp[i-1]);
        }
        return dp[nums.length];
    }
}
