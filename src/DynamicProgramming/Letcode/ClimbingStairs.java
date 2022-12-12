package DynamicProgramming.Letcode;
//Leetcode Link:- https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {
    public int climbStairs(int n) {
        int arr[] = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        if (n >1)
            arr[2] = 2;

        for(int i=3;i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[n];
    }
}
/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */