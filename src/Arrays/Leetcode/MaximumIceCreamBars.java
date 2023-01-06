package Arrays.Leetcode;

import java.util.Arrays;

//Leetcode Link:-https://leetcode.com/problems/maximum-ice-cream-bars/description/
public class MaximumIceCreamBars {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        for (int i=0;i< costs.length;i++) {
            if (costs[i]>coins) {
                break;
            }
            count++;
            coins-=costs[i];
        }
        return count;
    }
//    T(n)= nlogn
    //another approach is dp
    //2n time complexity and maxnumberInCost space comlexity
}
