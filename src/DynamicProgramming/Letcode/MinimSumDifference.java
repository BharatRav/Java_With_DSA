package DynamicProgramming.Letcode;
//Leetcode Link:- https://leetcode.com/problems/partition-array-into-two-arrays-to-minimize-sum-difference/description/

import java.util.ArrayList;

public class MinimSumDifference {
    public int minimumDifference(int[] nums) {
        int n = nums.length;
        int Totalsum=0;
        for (int val: nums)
            Totalsum+=val;
        // after taking total sum
        //i know that  s1+s2= TotalSum
        // minimum sum diff = s2-s1(here s1 is smaller)

        boolean[][] dp = new boolean[n+1][Totalsum+1];

        for (int j=0;j<=Totalsum;j++) {
            //if no element present then result will be false
            dp[0][j] = false;
        }

        for (int i =0; i<=n; i++) {
            //if sum is zero then we take {} nothing so tht it will give us true
            dp[i][0]= true;
        }
        //after completing initializing
        //let's code
        for (int i=1;i<=n;i++) {
            for (int j=1;j<= Totalsum;j++) {
                if (nums[i-1]<=j) {
                    dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j];
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        //after filling table, the logic part start
        /*
        TotalSum = s1+s2;
        s2 -s1(smaller) =mindiff
         (TotalSum -s1) - s1
         TotalSum - 2s1 = mindiff

         so im taking s1 having sum = targetSum/2 or less than it
         so that i can get min diff betwwen s1 and s2
         so ,
         for further things i take only last row with half colums(TotalSum/2)
         */
        ArrayList<Integer> accessKey = new ArrayList<>();

        for (int j=0;j<=Totalsum/2;j++) {
            if(dp[n][j]){
                accessKey.add(j);
            }
        }

        //now the result will be mindiff inbetwwen accesskeys
        int minDiff = Integer.MAX_VALUE;
        for (int currentSum:accessKey) {
            minDiff = Math.min(minDiff,(Totalsum-(2*currentSum)));
        }

        //now we got minDiff by TargetSum-2*s1
        return minDiff;


    }


    //<<<<<<<<<<<<<<<<<<<<<<,in this code, it works nly fr positive sum>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
}
