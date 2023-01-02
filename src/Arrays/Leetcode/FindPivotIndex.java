package Arrays.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/find-pivot-index/?envType=study-plan&id=level-1
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int leftsum=0;
        int rightsum=0;
        int index=-1;

        for(int i=0;i<nums.length;i++) {
            rightsum+=nums[i];
        }

        for(int i=0;i<nums.length;i++) {
            rightsum-=nums[i];
            if(leftsum==rightsum) {
                return i;
            }
            leftsum+=nums[i];
        }
        return index;
    }
}
