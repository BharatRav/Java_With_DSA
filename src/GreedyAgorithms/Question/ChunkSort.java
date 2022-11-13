package GreedyAgorithms.Question;

import java.util.Scanner;

public class ChunkSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i] =sc.nextInt();
        }

        int result =0;
        int key =arr[0];
        for (int i=0;i<n;i++) {
            if(key>arr[i]) {
                continue;
            }
            result++;
            key =arr[i];
        }
        System.out.println(result);
    }
}
