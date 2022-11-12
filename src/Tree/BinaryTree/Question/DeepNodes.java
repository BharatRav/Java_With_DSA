package Tree.BinaryTree.Question;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class DeepNodes {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    private static void DepthPrint(Node rootNode,int D){
        if(rootNode==null){
            while(D-->0){
                System.out.print(0+" ");
            }
            return;
        }
        Queue<Node> qu= new LinkedList<>();
        int countCompleted=0;
        qu.add(rootNode);
        while(!qu.isEmpty()){
            System.out.print(qu.size()+" ");
            int limit=qu.size();
            countCompleted++;
            for(int i=0;i<limit;i++){
                Node temp=qu.poll();
                if(temp.left!=null){
                    qu.offer(temp.left);
                }
                if(temp.right!=null){
                    qu.offer(temp.right);
                }
            }
        }
        while(countCompleted++<D){
            System.out.print(0+" ");
        }
    }
    private static void inorder(Node currentNode){
        if(currentNode==null){
            return ;
        }
        inorder(currentNode.left);
        System.out.print(currentNode.data+" ");
        inorder(currentNode.right);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node arr[]=new Node[n+1];
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i]+" ");
            arr[i]=new Node(i);
        }
        for (int i = 1; i <= n; i++) {
            int l=sc.nextInt();
            int r=sc.nextInt();
            arr[i].left=(l==-1)?null:arr[l];
            arr[i].right=(r==-1)?null:arr[r];
        }
        //inorder(hm.get(1));
        //System.out.println();
        DepthPrint(arr[1],n);
    }
}




/*
Deep Nodes
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a binary tree of N nodes, with root 1, find the number of nodes at depth D of the tree for all D from 1 to N, where depth of root node is taken to be 1.
Input
First line contains the integer N, denoting the number of nodes in the binary tree.
Next N lines contains two integers denoting the left and right child of the i'th node respectively.
If the node doesn't have a left or right child, it is denoted by '-1'

1 <= N <= 100000
Output
Print a single line containing N integers denoting the number of nodes at depth D of the tree.
Example
Sample Input 1:
5
2 4
5 3
-1 -1
-1 -1
-1 -1
Sample output 1:
1 2 2 0 0

Explanation: Given binary tree
1
/ \
2 4
/ \
5 3
 */