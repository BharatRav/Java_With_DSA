package Contest_Fabruary_placeCom;

import java.util.Scanner;

public class Move_Zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();;
        int[] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }

        int start=0;
        int end=n-1;

        while (start<end){
            while ( end > start && arr[end]==0) {
                end--;
            }

            while ( end > start && arr[start]!=0) {
                start++;
            }

            if (start<end) {
                int temp= arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }

        for (int val:arr) {
            System.out.print(val+" ");
        }

    }
}
