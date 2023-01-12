package Tree.DFS;

import java.util.*;

public class NumberOfNodesInTheSubTreeWithTheSameLabel {

    public int[] countSubTrees(int n,int[][] edges,String labels) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] edge : edges) {
            map.putIfAbsent(edge[0],new ArrayList<>());
            map.putIfAbsent(edge[1], new ArrayList<>());

            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        int[] ans = new int[n];
        Set<Integer> visited = new HashSet<>();
        helper(map,0,labels,ans,visited);
        return ans;
    }
    public int[] helper(Map<Integer, List<Integer>> map, int node, String labels, int[] ans, Set<Integer> visited) {
        int[] cnt = new int[26];
        if (visited.add(node)) {
            char ch = labels.charAt(node);
            for (int child: map.getOrDefault(node,Collections.emptyList())) {
                int[] sub = helper(map,child,labels,ans,visited);
                for (int i=0;i<26;i++) {
                    cnt[i]+=sub[i];
                }
            }
            cnt[ch- 'a']++;
            ans[node] =cnt[ch-'a'];
        }
        return cnt;
    }
}
