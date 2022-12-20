package Arrays.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/minimum-average-difference/description/
public class MinimumAverageDifference {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length, idx =0;
        long min = Integer.MAX_VALUE;
        long[] pre = new  long[n];
        pre[0] = nums[0];
        for (int i=1;i<n;i++) {
            pre[i] = pre[i-1]+nums[i];
        }

        for (int i=0;i<n-1;i++) {
            long diff = (long) Math.abs(Math.round( pre[i]/(i+1)-Math.round( (pre[n-1]-pre[i])/(n-i-1) )));

            if (diff <min) {
                idx =i;
                min = diff;
            }
        }
        if (min>pre[n-1]/n)
            return n-1;
        return idx;
    }
}
