package GreedyAgorithms.Leetcode;

public class JumpGameII {
    public int jump(int[] nums) {
        int currentRangedJump =0;
        int NoOfJump =0;
        int farshest =0;
        for(int i=0;i<nums.length-1;i++) {
            farshest =Math.max(farshest,i+nums[i]);

            if (i == currentRangedJump) {
                currentRangedJump = farshest;
                NoOfJump++;
            }
        }
        return NoOfJump;
    }
}
