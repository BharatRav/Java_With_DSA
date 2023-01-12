package Tree.Graph.Leetcode;

import java.util.ArrayList;
import java.util.List;

//Leetcode Link:-https://leetcode.com/problems/all-paths-from-source-to-target/description/
public class AllPathsFromSourceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        path.add(0);
        dfsSearch(graph,0,res,path);
        return res;
    }
    private void dfsSearch(int[][] graph, int node, List<List<Integer>> res, List<Integer> path) {
        if (node == graph.length-1) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (Integer nextnode: graph[node]) {
            path.add(nextnode);
            dfsSearch(graph,nextnode,res,path);
            path.remove(path.size()-1);
        }
    }
}
