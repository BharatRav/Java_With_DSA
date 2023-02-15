package Arrays.Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//LeetcodeLink:-https://leetcode.com/problems/add-to-array-form-of-integer/
public class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();

        for(int i=nums.length-1;i>=0;i--) {
            res.add(0,(nums[i]+k)%10);
            k=(nums[i]+k)/10;
        }
        while (k>0) {
            res.add(0,k%10);
            k/=10;
        }
        return res;
    }
}
