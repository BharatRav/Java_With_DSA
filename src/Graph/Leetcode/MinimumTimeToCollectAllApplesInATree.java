package Graph.Leetcode;

import java.util.*;

//LeetcodeLink:-
public class MinimumTimeToCollectAllApplesInATree {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        //construct Map;
        Map<Integer, List<Integer>> map = new HashMap<>();
        buildTree(edges,map);
        Set<Integer> visited = new HashSet<>();
        return helper(0,map,visited,hasApple);
    }
    private static int helper(int node,Map<Integer, List<Integer>> map,Set<Integer> visited,List<Boolean> hasApple) {
        visited.add(node);
        int res =0;

        for (int child:map.getOrDefault(node,new LinkedList<>())) {
            if (visited.contains(child)) {
                continue;
            }
            res+=helper(child, map, visited, hasApple);
        }

        if ( (res>0||hasApple.get(node))  &&  node!=0) {
            res+=2;
        }
        return res;
    }

    private  static  void  buildTree(int[][] edges, Map<Integer,List<Integer>> map) {
        for (int[] edge: edges) {
            int source= edge[0];
            int destination =edge[1];
            map.putIfAbsent(source,new LinkedList<>());
            map.putIfAbsent(destination,new LinkedList<>());
            map.get(source).add(destination);
            map.get(destination).add(source);
        }
    }
}

//Refrence Link: https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/solutions/623686/java-detailed-explanation-build-tree-dfs/?orderBy=most_votes
