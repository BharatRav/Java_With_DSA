package Tree.Graph.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Leetcode Link:-https://leetcode.com/problems/possible-bipartition/description/
public class PossibleBipartition {


    //here 0 represent currently not chosen
    //1 represent color one  team
    //-1 repreent color -1 team
    Map<Integer, List<Integer>> map = new HashMap<>();
    public boolean possibleBipartition(int N, int[][] dislikes) {
        for (int[] dis : dislikes) {
            if (map.get(dis[0]) == null) map.put(dis[0], new ArrayList<>());
            map.get(dis[0]).add(dis[1]);
            if (map.get(dis[1]) == null) map.put(dis[1], new ArrayList<>());
            map.get(dis[1]).add(dis[0]);
        }
        int[] colors = new int[N+1];
        for (int i = 1; i <= N; i++){
            if (map.get(i) == null) continue;
            if (colors[i] == 0 && !helper(i,colors,1)) return false;
        }
        return true;
    }

    public boolean helper(int index, int[] colors, int color) {
        if (colors[index] != 0) return color == colors[index];
        int len = map.get(index).size();
        colors[index] = color;
        for (int i = 0; i < len; i++) {
            if (!helper(map.get(index).get(i),colors,-1*color)) return false;
        }
        return true;
    }
}
