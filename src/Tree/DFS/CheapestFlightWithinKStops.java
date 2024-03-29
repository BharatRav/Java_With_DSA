package Tree.DFS;

import java.util.*;
//LeetcodeLink:-https://leetcode.com/problems/cheapest-flights-within-k-stops/description/
public class CheapestFlightWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K)
    {
        int[] cost=new int[n];
        Arrays.fill(cost,Integer.MAX_VALUE);
        cost[src]=0;
        for(int i=0;i<=K;i++)
        {
            int[] temp= Arrays.copyOf(cost,n);
            for(int[] f: flights)
            {
                int curr=f[0],next=f[1],price=f[2];
                if(cost[curr]==Integer.MAX_VALUE)
                    continue;
                temp[next]=Math.min(temp[next],cost[curr]+price);
            }
            cost=temp;
        }
        return cost[dst]==Integer.MAX_VALUE?-1:cost[dst];
    }
    //Reffrence Link:-https://leetcode.com/problems/cheapest-flights-within-k-stops/solutions/361711/java-dfs-bfs-bellman-ford-dijkstra-s/?orderBy=most_votes
}
