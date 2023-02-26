package _Leetcode_Contests.WeaklyContest_334;
//LeetcodeLink:-https://leetcode.com/contest/weekly-contest-334/problems/left-and-right-sum-differences/
public class LeftAndRightSumDifferences {
    public int[] leftRigthDifference(int[] nums) {
        int n =nums.length;

        int[] answer =new int[n];
        long rightSum =0,leftSum=0;
        //basically totalsum = rightsum
        for (int i=0;i<n;i++) {
            rightSum+=nums[i];
        }


        for (int i=0;i<n;i++) {
            answer[i] = (int)Math.abs(leftSum-(rightSum-nums[i]));
            leftSum+=nums[i];
            rightSum-=nums[i];
        }
        return answer;
    }
}
