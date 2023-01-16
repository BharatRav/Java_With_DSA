package Arrays.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Leetcode Link:-https://leetcode.com/problems/insert-interval/
public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> res = new ArrayList<>();
        int start =newInterval[0];
        int end= newInterval[1];

        for (int[] slot: intervals) {
            if (newInterval[1]<slot[0]) {
                res.add(newInterval);
                newInterval =slot;
            } else if (slot[1]<newInterval[0]) {
                res.add(slot);
            } else {
                newInterval[0]= Math.min(slot[0],newInterval[0]);
                newInterval[1] = Math.max(slot[1],newInterval[1]);
            }
        }
        res.add(newInterval);

        return res.toArray(new int[res.size()][]);
    }
}
