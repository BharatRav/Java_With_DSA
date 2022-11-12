package Tree.BinaryTree.Question;

import java.util.Scanner;

public class CountLeavesInBinaryTree {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int left=sc.nextInt();
            int right=sc.nextInt();
            if(left+right==-2)
                count++;
        }
        System.out.println(count);
    }
}



/*
Count Leaves in Binary Tree
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a binary tree, count the number of leaves in it. A node having no child node is called a leaf.
Input
The first line contains the integer N, denoting the number of nodes in the binary tree.
Next N lines contain two integers, denoting the left and right child of the i-th node respectively.
If the node doesn't have a left or right child, it is denoted by '-1'

1 <= N <= 100000
Output
Print the number of leaves in the binary tree
Example
Sample Input 1:
7
2 4
5 3
-1 -1
-1 7
6 -1
-1 -1
-1 -1

Sample output 1:
3

Explanation: Given binary tree
1
/ \
2 4
/ \ \
5 3 7
/
6
Node 3, 6, 7 are the leaves here
 */
