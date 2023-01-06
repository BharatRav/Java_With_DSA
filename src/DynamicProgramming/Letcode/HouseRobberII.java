package DynamicProgramming.Letcode;
//Leetcode Link:-https://leetcode.com/problems/house-robber-ii/description/?envType=study-plan&id=dynamic-programming-i
public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length ==1) return nums[0];
        if (nums.length ==2) return Math.max(nums[0],nums[1]);

        int[] dpWithStartFirst = new int[nums.length+1];
        int[] dpWithStartSecond = new int[nums.length+1];

        //initialization
        /*
                dpWithStartFirst[0] =0,dpWithStartFirst[1] =starting with first element
                dpWithStartSecond[0] =0, dpWithStartSecond[1] =0
         */
        dpWithStartFirst[1] =nums[0];
//        dpWithStartSecond[1] =0;
        for (int i=2;i<= nums.length;i++) {        //here i'm stopping loop at 2nd last element because
                                                    //common part common is only till second last element
            dpWithStartFirst[i]= Math.max(nums[i-1]+dpWithStartFirst[i-2],dpWithStartFirst[i-1]);

            dpWithStartSecond[i]=Math.max(nums[i-1]+dpWithStartSecond[i-2],dpWithStartSecond[i-1]);
        }

        return Math.max(dpWithStartFirst[nums.length-1],dpWithStartSecond[nums.length]);
    }
}
