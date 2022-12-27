package GreedyAgorithms.Leetcode;

import java.util.Arrays;

//Leetcode Link:-https://leetcode.com/problems/maximum-bags-with-full-capacity-of-rocks/
public class MaximumBagsWithFullCapacityOfRocks {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n =capacity.length;

        for (int i=0;i<n;i++) {
            capacity[i] -= rocks[i];
        }
        int count =0;

        //Always pick the smallest bags first;
        Arrays.sort(capacity);

        for (int i=0;i<n && additionalRocks>0;i++) {
            if (additionalRocks>=capacity[i]) {
                count++;
            }
            additionalRocks-=capacity[i];
        }
        return count;
        //Tn =O(nlogn)
    }

}
