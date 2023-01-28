package OrderedSet.Leetcode;

import com.sun.source.tree.Tree;

import java.util.*;

public class DataStreamAsDisjointIntervals {
    TreeMap<Integer,int[]> tree;

    public DataStreamAsDisjointIntervals() {
        tree = new TreeMap<>();
    }

    public void addNum(int value) {
        if (tree.containsKey(value)) return;

        Integer lowerKey = tree.lowerKey(value);
        Integer higherKey = tree.higherKey(value);

        if (lowerKey!=null && higherKey!=null && tree.get(lowerKey)[1]+1==value && tree.get(higherKey)[0]-1 ==value){
            tree.get(lowerKey)[1] =tree.get(higherKey)[1];
            tree.remove(higherKey);
        } else if (lowerKey!=null && value<= tree.get(lowerKey)[1]+1) {
            tree.get(lowerKey)[1] = Math.max(value,tree.get(lowerKey)[1]);
        }else if (higherKey!=null &&  value == tree.get(higherKey)[0]-1) {
            tree.put(value,new int[]{value,tree.get(higherKey)[1]});
            tree.remove(higherKey);
        } else {
            tree.put(value,new int[] {value,value});
        }
    }

    public int[][] getIntervals() {
//         List<int[]> result = new ArrayList<>(tree.values());
         int[][] res = new int[tree.size()][2];
         int i=0;
         for (int[] a: tree.values()) {
             res[i++] = a;
         }
         return res;
    }
    //very tough question means very lengthy
    //but very important question by this question i got the knowledge about lowerkey higherkey ceiling key etc in map

}
