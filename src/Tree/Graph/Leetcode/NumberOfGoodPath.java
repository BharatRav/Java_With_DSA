package Tree.Graph.Leetcode;


import java.util.*;

public class NumberOfGoodPath {
    static int[] parent, count; // parent array to keep track of parent of each node and count array to keep track of number of nodes in each set
    static int res; // variable to store the number of good paths
    public static int numberOfGoodPaths(int[] vals, int[][] edges) {
        //Union Set Approach
        // sort edges based on the maximum value of the nodes in the edge
        Arrays.sort(edges, (a, b) -> Integer.compare(Math.max(vals[a[0]], vals[a[1]]), Math.max(vals[b[0]], vals[b[1]])));
        int n = vals.length;
        res = n; // initialize number of good paths to be equal to number of nodes
        parent = new int[n];
        count = new int[n];

        Arrays.fill(count, 1);  // initialize count of nodes in each set to be 1

        for (int i = 0; i < n; i++) {     // initialize parent of each node to be itself
            parent[i] =i;
        }

        for (int[] edge : edges) {
            union(edge[0], edge[1], vals);
        }
        return res;
    }
    // function to merge two sets
    private static void union(int x,int y,int[] vals) {
        int parx = find(x);
        int pary = find(y);
        if (parx == pary) return;   // if x and y are already in the same set, return

        if (vals[parx]==vals[pary]) {
            // if the values of the parents of x and y are equal, update number of good paths
            res+=count[parx]*count[pary];
            count[parx]+=count[pary];
            parent[pary] =parx;
        } else if (vals[parx]>vals[pary]) {
            parent[pary] =parx;
        } else  {
            parent[parx]=pary;
        }
    }
    // function to find the parent of a node
    private  static int find(int index) {
        if (parent[index]==index) return index;

        return parent[index] = find(parent[index]);
    }

    public static void main(String[] args) {
        int[] vals = {1,3,2,1,3};
        int[][] edges = {{0,1},{0,2},{2,3},{2,4}};
        System.out.println(numberOfGoodPaths(vals,edges));
    }

    //best resource:-https://leetcode.com/problems/number-of-good-paths/solutions/3053512/java-solution-with-comments-and-explanation/?orderBy=most_votes
}
