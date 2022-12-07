package Arrays.Leetcode;

import java.util.HashSet;
import java.util.Set;

//Leetcode Link:- https://leetcode.com/problems/contains-duplicate/description/?envType=study-plan&id=data-structure-i
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // boolean flag=false;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1]){
        //         flag=true;
        //         break;
        //     }
        // }
        // return flag;
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums)
            if(!set.add(i))// if there is same
                return true;
        return false;
    }
}
