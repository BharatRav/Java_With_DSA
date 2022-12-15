package Arrays.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/3sum-closest/
import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if(nums==null || nums.length<3) return -1;

        Arrays.sort(nums);

        int res = nums[0] + nums[1] + nums[2];
        for(int i=0; i<nums.length-2; i++){

            int left = i + 1, right = nums.length - 1;
            while(left<right){
                int sum = nums[left]+nums[right] + nums[i];
                if(Math.abs(target-sum) < Math.abs(target-res)) res = sum;
                if(sum == target) return sum;
                if(sum > target) right--;
                else left++;
            }
        }
        return res;
    }
}
