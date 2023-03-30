package GreedyAgorithms.Leetcode;

import java.util.Arrays;

public class ReducingDishes {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int postSum=0,cur=0,res=0;
        for(int i=satisfaction.length-1; i>=0; i--){
            postSum += satisfaction[i];
            cur += postSum;
            res = Math.max(res, cur);
        }
        return res;
    }
}
