package Arrays.Leetcode;
//Leetcode Link:- https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max =0;
        int count =0;
        for (int i=0;i< prices.length-1;i++) {
            count+=prices[i+1]-prices[i];
            if (count<0) {
                count=0;
            }
            if (count>max) {
                max = count;
            }
        }
        return max;
    }
}
