package GreedyAgorithms.Leetcode;

public class JumpGame {
    public boolean canJump(int[] nums) {
        boolean resultFlag =  false;
        int n =nums.length; // traversing from to last to 0th index
        int currentDestination = n-1;
        for (int i =(n-2);i>=0;i--) {
            if(i+nums[i]>=currentDestination) {
                currentDestination = i;
            }
        }

        if(currentDestination == 0) {
            return true;
        }
        return resultFlag;
    }
}
