package GreedyAgorithms.Leetcode;

import java.util.Arrays;

public class MaxChunksToMakeSortedII {
    public int maxChunksToSorted(int[] arr) {

        int[] sorted = arr.clone();
        int [] unsorted = arr.clone();

        Arrays.sort(sorted);

        int sum1 = 0;
        int sum2 = 0;
        int result = 0;

        for (int i=0;i<arr.length;i++) {
            sum1+=sorted[i];
            sum2+=unsorted[i];

            if (sum1 == sum2) {
                result++;
            }
        }

        return result;
    }
}
