package Tree.BinaryTree.Question;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfLeaves {

 static class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

    public static int sumOfLeaf(Node root)
    {
        int sum=0;

        if(root==null){
            return sum;
        }

        Queue<Node> qu=new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            Node temp=qu.poll();
            if(temp.left==null && temp.right==null){
                sum+=temp.data;
            }else{
                if(temp.left!=null){
                    qu.offer(temp.left);
                }
                if(temp.right!=null){
                    qu.offer(temp.right);
                }
            }
        }
        return sum;
    }

    //method 2
    /*
    public static int sumOfLeaf(Node root) {
        // Your code here
        int sum = 0;
        if(root != null) {
            if(root.left == null && root.right == null) {
                sum = sum + root.data;
            }
            sum = sum + sumOfLeaf(root.left);
            sum = sum + sumOfLeaf(root.right);
        }
        return sum;
    }
     */
}




/*
Sum of leaves
easy
Problem Statement
Given a Binary Tree, your task is to compute the sum of all leaf nodes in the tree.

Note :- All the nodes in the tree are distinct .
Input
User Task:
Since this will be a functional problem. You don't have to take input. You just have to complete the function sumOfLeaf() that takes "root" node as parameter.

Constraints:
1 <= T <= 100
1 <= N <= 10^5
1 <= node values <= 10^5

Sum of "N" over all test cases does not exceed 2*10^5

For Custom Input:
First line of input should contains the number of test cases T. For each test case, there will be two lines of input.
First line contains number of nodes N and the required sum X. Second line will be a string representing the tree as described below:
The values in the string are in the order of level order traversal of the tree where, numbers denote node values, and a character “N” denotes NULL child.
Note: If a node has been declared Null using 'N', no information about its children will be given further in the array.
Output
Return the sum of all the leaf nodes of the binary tree.
Example
Sample Input:
2
3
10 8 34
2
48 36

Sample Output:
42
36
 */