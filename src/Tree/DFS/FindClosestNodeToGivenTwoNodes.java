package Tree.DFS;

import java.util.Arrays;
//Leetcode Link:-https://leetcode.com/problems/find-closest-node-to-given-two-nodes/description/

public class FindClosestNodeToGivenTwoNodes {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n =edges.length;
        int[] dist1 = new int[n];
        Arrays.fill(dist1,-1);

        int[] dist2 = new int[n];
        Arrays.fill(dist2,-1);

        dist1[node1] =0;
        dist2[node2] =0;

        int dist=0;
        int i=node1;
        while(true) {
            dist1[i] =dist++;
            i=edges[i];
            if(i==-1 || dist1[i]!=-1) {
                break;
            }
        }

        dist=0;
        i=node2;
        while(true) {
            dist2[i] =dist++;
            i=edges[i];
            if(i==-1 || dist2[i]!=-1) {
                break;
            }
        }

        int res=-1;
        int min =Integer.MAX_VALUE;
        for (int j=0;j<n;j++) {
            if(dist1[j]==-1 || dist2[j]==-1) {
                continue;
            }

            if(min>Math.max(dist1[j],dist2[j])) {
                min =Math.max(dist1[j],dist2[j]);
                res =j;
            }
        }

        return res;
    }
}

//Reffrence Link on Youtube https://www.youtube.com/watch?v=MK9NVThkSGc
