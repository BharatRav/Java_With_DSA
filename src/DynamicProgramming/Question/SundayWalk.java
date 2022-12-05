package DynamicProgramming.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SundayWalk {
    static  int dp[][];
    private  static boolean sundayWalkResult(int n, float p) {
        if (n<=0 || p ==0)
            return false;

        sundayWalkResult(n-2,1);
        sundayWalkResult(n-3,1-p);
        return false;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        float p = sc.nextFloat();

        boolean result = sundayWalkResult(n,p);
        System.out.print(result);
        //...............................
        // code is not complete
    }
}
/*
Sunday Walk
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Jenny was walking along the beach on a Sunday evening.
She started from a point 0 and wants to reach a point N.
What is the probability that she reaches exactly on point N,
if she can only take 2 steps or 3 steps?
Probability for step length 2 is P and probability for step length 3 is 1 – P.

Input
The first line of the input contains n and p.

Constraints
1<= n <= 1e5
0 <= p <= 1
Output
Print the final probability upto 2 decimal places.
Example
Sample Input
5 0.2

Sample Output
0.32
 */
