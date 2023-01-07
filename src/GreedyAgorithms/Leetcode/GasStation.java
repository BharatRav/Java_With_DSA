package GreedyAgorithms.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/gas-station/description/
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int end =gas.length-1;
        int sum=gas[end]-cost[end];
        while(start<end) {
            if (sum>0) {
                sum+=gas[start]-cost[start];
                start++;

            } else {
                end--;
                sum+=gas[end]-cost[end];

            }
        }

        return sum>=0?end:-1;
    }
}
