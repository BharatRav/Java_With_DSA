package Arrays.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/running-sum-of-1d-array/?envType=study-plan&id=level-1
public class RunningSumOf1DArray {
    public int[] runningSum(int[] nums) {
        for (int i=1;i< nums.length;i++) {
            nums[i] =nums[i-1];
        }
        return nums;
    }

}
