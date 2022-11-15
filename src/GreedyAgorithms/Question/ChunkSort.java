package GreedyAgorithms.Question;

import java.util.Arrays;
import java.util.Scanner;

public class ChunkSort {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxChunksToSorted(arr));
    }
    public static int maxChunksToSorted(int[] arr) {

        int n = arr.length;
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int[] unsorted = arr.clone();


        int sum1 = 0;
        int sum2 = 0;

        int result = 0;
        for(int i = 0; i < n; i++){
            sum1+=unsorted[i];
            sum2+=sorted[i];
            if(sum1 == sum2){
                result++;
            }
        }
        return result;
    }
}
