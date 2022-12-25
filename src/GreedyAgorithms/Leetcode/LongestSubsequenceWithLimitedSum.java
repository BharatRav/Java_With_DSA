package GreedyAgorithms.Leetcode;

import java.util.Arrays;

//Leetcode Link:-https://leetcode.com/problems/longest-subsequence-with-limited-sum/
public class LongestSubsequenceWithLimitedSum {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] ans = new int[queries.length];
        int sum;
        for (int i=0;i<queries.length;i++) {
            sum=0;
            for (int j=0;j< nums.length;j++) {
                sum+=nums[j];
                if (sum>queries[i]) {
                    ans[i] =j;  // very important line
                    break;
                }
                if (j == nums.length-1 && sum<=queries[i]) {
                    ans[i] =j+1;
                }
            }
        }
        return ans;
    }
}
