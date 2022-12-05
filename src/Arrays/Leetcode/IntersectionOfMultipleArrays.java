package Arrays.Leetcode;

//Leetcode Link:-https://leetcode.com/problems/intersection-of-multiple-arrays/description/
import java.util.*;

class IntersectionOfMultipleArrays {
    public List<Integer> intersection(int[][] nums) {
        int freq[] = new int[1001];

        for (int i =0; i<nums.length;i++) {
            for (int j=0;j<nums[i].length;j++) {
                freq[nums[i][j]]++;
            }
        }

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++) {
            for (int j=0;j<nums[i].length;j++) {
                if(freq[nums[i][j]]==nums.length) {
                    set.add(nums[i][j]);
                }
            }
        }
        for(int x:set)
            list.add(x);
        Collections.sort(list);
        return list;


    }
}