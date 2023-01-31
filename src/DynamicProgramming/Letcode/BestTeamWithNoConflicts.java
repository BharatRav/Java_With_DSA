package DynamicProgramming.Letcode;

import java.util.Arrays;

//Leetcode Link:-https://leetcode.com/problems/best-team-with-no-conflicts/
public class BestTeamWithNoConflicts {
    public int bestTeamScore(int[] scores, int[] ages) {
        int n =ages.length;
        int[][] team = new int[n][2];

        for (int i=0;i<n;i++) {
            team[i][0]= ages[i];
            team[i][1]=scores[i];
        }

        int[][] dp = new int[n][n];
        for (int[] a:dp){
            Arrays.fill(a,-1);
        }
        Arrays.sort(team, (a,b) -> a[0]==b[0] ?   a[1]-b[1]  :   a[0]-b[0]);

        return bestTeamHelper(dp,team,0,-1);
    }

    private static int bestTeamHelper(int[][] dp, int[][] team,int idx, int prev) {
        if (idx==team.length) return 0;

        if (dp[prev+1][idx]!=-1) {
            return dp[prev+1][idx];
        }

        if (prev==-1 || team[prev][1]<= team[idx][1]) {
            return dp[prev+1][idx] =Math.max(
                    team[idx][1] +bestTeamHelper(dp,team, idx+1, idx),
                    bestTeamHelper(dp,team, idx+1, prev)
            );
        }
        return bestTeamHelper(dp, team, idx+1, prev);
    }

    //may be helpful
    //https://www.youtube.com/watch?v=ccAUYuABMq0
}
