package Tree.DijikstaAlgorithm;

import java.util.*;
//LeetcodeLink:-https://leetcode.com/problems/cheapest-flights-within-k-stops/description/
public class CheapestFlightWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K)
    {
        Map<Integer, List<int[]>> map=new HashMap<>();
        for(int[] f:flights)
        {
            map.putIfAbsent(f[0],new ArrayList<>());
            map.get(f[0]).add(new int[]{f[1],f[2]});
        }
        PriorityQueue<int[]> q=new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0],o2[0]);
            }
        });
        q.offer(new int[]{0,src,K+1});
        while(!q.isEmpty())
        {
            int[] c=q.poll();
            int cost=c[0];
            int curr=c[1];
            int stop=c[2];
            if(curr==dst)
                return cost;
            if(stop>0)
            {
                if(!map.containsKey(curr))
                    continue;
                for(int[] next:map.get(curr))
                {
                    q.add(new int[]{cost+next[1],next[0],stop-1});
                }
            }
        }
        return -1;
    }
    //Reffrence Link:-https://leetcode.com/problems/cheapest-flights-within-k-stops/solutions/361711/java-dfs-bfs-bellman-ford-dijkstra-s/?orderBy=most_votes
}
