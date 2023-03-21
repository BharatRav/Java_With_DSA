package Math;

public class NumberOfZeroFilledSubarrays {
    public long zeroFilledSubarray(int[] nums) {
        long res=0,start=-1,count=0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i]==0) {
                count +=(i-start);
            } else {
                res+=count;
                start=i;
                count=0;
            }
        }
        return res+count;
    }
}
