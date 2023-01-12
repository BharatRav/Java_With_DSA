package Tree.Graph.Leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

//Leetcode Link:-https://leetcode.com/problems/find-if-path-exists-in-graph/description/
public class FindIfPathExistInGraph {

    //Using BFS

    public boolean validPath(int n, int[][] edges, int start, int end) {
        boolean[] visited = new boolean[n];

        HashSet<Integer>[] graph = new HashSet[n];

        for (int i=0;i<n;i++) {
            graph[i] = new HashSet<>();
        }

        for (int[] edge: edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        if (graph[start].contains(end)){
            return true;
        }


        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        visited[start] = true;

        int size,current;
        while (!queue.isEmpty()) {
            size = queue.size();
            current =queue.poll();
            if (current ==end){
                return  true;
            }

            for (Integer neighbour:graph[current]) {
                if (!visited[neighbour]) {
                    visited[neighbour] =true;

                    queue.add(neighbour);
                }
            }
        }
        return false;
    }
}
