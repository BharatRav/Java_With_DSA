package Arrays.HashMap;

import java.util.HashMap;
import java.util.Map;

//Leetcode Link:-https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/description/
public class MinimumRoundsToCompleteAllTasks {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> hm = new HashMap<>();

        for (int data: tasks) {
            hm.put(data,hm.getOrDefault(data,0)+1);
        }

        int count =0;

        for (Map.Entry<Integer,Integer> val: hm.entrySet()) {
            if (val.getValue() == 1) {
                return -1;
            }
            count+= val.getValue()/3;

            if (val.getValue()%3!=0) {
                count++;
            }

        }
        return count;
    }
}
