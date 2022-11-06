package GreedyAgorithms.Leetcode;
// Leetcode Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int totalProfit =0;
        //if length is 0 then for loop will not we executed,
        //hence edge case is also solved
        for (int i=1;i<prices.length;i++) {
            if (prices[i]>prices[i-1]) {
                totalProfit += prices[i] - prices[i-1];
            }
        }
        return totalProfit;
    }
}
