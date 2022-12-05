package DynamicProgramming.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ZeroOneknapsackUsing1DArrayBestOne {
    static int knapSack(int W, int wt[], int val[], int n) {
        int []dp = new int[W + 1];

        for (int i = 0; i < n; i++) {
            for (int j = W; j >= 0; j--) {

                if (wt[i] <= j){
                    dp[j] = Math.max(dp[j], dp[j - wt[i]] + val[i]);
                }
            }
        }

        return dp[W];
    }
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().strip());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().strip());
            int w = Integer.parseInt(br.readLine().strip());

            int value[] = new int[n];
            String line[] = br.readLine().strip().split(" ");

            for(int i=0; i<n; i++){
                value[i] = Integer.parseInt(line[i]);
            }

            int weight[] = new int[n];
            line = br.readLine().strip().split(" ");

            int minWeight = Integer.MAX_VALUE;
            for(int i=0; i<n; i++){
                weight[i] = Integer.parseInt(line[i]);
                if(minWeight > weight[i]){
                    minWeight = weight[i];
                }
            }

            if(minWeight > w){
                System.out.println(0);
            }else{
                System.out.println(knapSack(w, weight, value, n));
            }
        }
    }
}
