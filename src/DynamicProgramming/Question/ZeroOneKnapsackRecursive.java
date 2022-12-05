package DynamicProgramming.Question;

import java.util.Scanner;

public class ZeroOneKnapsackRecursive {
    int[][] dp;
    ZeroOneKnapsackRecursive(int n, int W) {
        dp = new int[n+1][W+1];

        for (int i=0;i<=n;i++) {
            for (int j=0;j<=W;j++) {
                dp[i][j] = -1;
            }
        }
    }
    private int zeroOneKnapsack(int[] val, int[] wt, int W, int n) {
        if (n==0|| W==0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n-1]<=W) {
            return dp[n][W] =Math.max((val[n-1]+zeroOneKnapsack(val,wt,W-wt[n-1],n-1)),zeroOneKnapsack(val,wt,W,n-1));
        }

        return dp[n][W] =zeroOneKnapsack(val,wt,W,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-->0) {
            int n = sc.nextInt();   //no. of items
            int W = sc.nextInt();   //maximum capacity of the knapsack

            int[] val = new int[n];

            int[] wt = new int[n];

            for (int i=0;i<n;i++) {
                val[i]= sc.nextInt();
            }

            for (int i=0;i<n;i++) {
                wt[i] = sc.nextInt();
            }
            ZeroOneKnapsackRecursive zk = new ZeroOneKnapsackRecursive(n,W);
            int MaxTotalVal = zk.zeroOneKnapsack(val,wt,W,n);
            System.out.println(MaxTotalVal);
        }
    }
}

/*
0-1 Knapsack Problem
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given weights and values of N items, put some or all of these items in a knapsack of capacity W weight to get the maximum total value in the knapsack. Note that we have at most one quantity of each item.
In other words, given two integer arrays val[0..(N-1)] and wt[0..(N-1)] which represent values and weights associated with N items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W. You cannot break an item, either pick the complete item, or don’t pick it (0-1 property).

Input
The first line of input contains an integer T denoting the number of test cases.
Then T test cases follow. Each test case consists of four lines.
The first line consists of N the number of items.
The second line consists of W, the maximum capacity of the knapsack.
In the next line are N space separated positive integers denoting the values of the N items,
and in the fourth line are N space separated positive integers denoting the weights of the corresponding items.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 1000
1 ≤ W ≤ 1000
1 ≤ wt[i] ≤ 1000
1 ≤ v[i] ≤ 1000
Output
For each testcase, in a new line, print the maximum possible value you can get with the given conditions that you can obtain for each test case in a new line.
Example
Input:
2
3
4
1 2 3
4 5 1
3
3
1 2 3
4 5 6

Output:
3
0
 */
