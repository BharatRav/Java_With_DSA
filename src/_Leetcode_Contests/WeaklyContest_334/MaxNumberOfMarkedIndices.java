package _Leetcode_Contests.WeaklyContest_334;

import java.util.Arrays;

public class MaxNumberOfMarkedIndices {
    public int maxNumOfMarkedIndices(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        int l = 0, r = (n + 1) / 2;
        while (r < n) {
            if (nums[l] * 2 <= nums[r]) {
                ans++;
                l++;
            }
            r++;
        }
        return 2 *ans;
    }
}
