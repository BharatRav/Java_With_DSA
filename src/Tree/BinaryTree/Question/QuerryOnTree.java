package Tree.BinaryTree.Question;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class QuerryOnTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();

        //now creating array having nodes with value 0
        Node[] arr=new Node[n];
        for(int i=0;i<n;i++){
            arr[i]=new Node(0);
        }

        //now taking n lines  having left and right
        for(int i=0;i<n;i++){
            int left=sc.nextInt();
            int right=sc.nextInt();

            if(left!=-1){
                arr[i].left=arr[left-1];
            }

            if(right!=-1){
                arr[i].right=arr[right-1];
            }
        }

        //taking q queries
        for(int i=0;i<q;i++){
            int queryType=sc.nextInt();
            perform(queryType,arr,sc);
        }
    }
    private static void perform(int queryType, Node[] arr,Scanner sc){
        switch(queryType){
            case 1:{ int NodeNumber=sc.nextInt();     //u
                int ValueToBeAdded=sc.nextInt();//x
                addValue(arr[NodeNumber-1],ValueToBeAdded);
                break;
            }
            case 2: {int NodeNumber=sc.nextInt();
                System.out.println(arr[NodeNumber-1].data);
                break;
            }
        }
    }

    private static void addValue(Node root,int Value){
        if(root==null){
            return;
        }
        root.data=root.data+Value;
        addValue(root.left,Value);
        addValue(root.right,Value);
    }
}




/*


Query on Tree
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a binary tree of N nodes with root 1. Initially all nodes have value 0.
You have two type of queries
1 u x - add x to all nodes in subtree of node u
2 u - print the value of node u
Input
First line contains the integer N and Q, denoting the number of nodes in the binary tree and the number of queries respectively.
Next N lines contains two integers denoting the left and right child of the i'th node respectively.
If the node doesn't have a left or right child, it is denoted by '-1'
Next Q lines contains queries of two types:
1 u x
2 x
1 <= N, Q <= 5000
1 <= u <= N
1 <= x <= 5000
Output
For each query of type 2 print a single line containing the answer
Example
Sample Input 1:
9 5
2 4
5 3
6 -1
-1 7
-1 -1
-1 -1
9 8
-1 -1
-1 -1
1 2 5
1 1 3
2 7
1 4 2
2 6
Sample output 1:
3
8

Explanation: Given binary tree
1
/ \
2 4
/ \ \
5 3 7
/ / \
6 9 8
Query 1: add all nodes in subtree of 2 with 5
Query 2: add all nodes in subtree of 1 with 3
Query 3: value of node 7 is 3 now
Query 4: add all nodes in subtree of 4 with 2
Query 5: value of node 6 is 8 now
 */
