package Tree.BinaryTree.Question;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class PostOrdertraversal {

    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
        }
    }

    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        node currentRoot,leftChild,RightChild;
        Map<Integer,node> hm= new HashMap<>();
        for(int i=1;i<=n;i++){
            if(hm.containsKey(i)){
                currentRoot=hm.get(i);
            }else{
                currentRoot=new node(i);    //same data i for ith node
                hm.put(i,currentRoot);
            }

            //taking ith line's data
            int l=sc.nextInt();
            int r=sc.nextInt();

            if(l!=-1){
                if(hm.containsKey(l)){
                    currentRoot.left=hm.get(l);
                }else{
                    currentRoot.left=new node(l);
                    hm.put(l,currentRoot.left);
                }
            }
            if(r!=-1){
                if(hm.containsKey(r)){
                    currentRoot.right=hm.get(r);
                }else{
                    currentRoot.right=new node(r);
                    hm.put(r,currentRoot.right);
                }
            }
        }

        //now call postOrderTraversal
        postOrderTraversal(hm.get(1));
    }
    private static void postOrderTraversal(node RootNode){
        if(RootNode==null){
            return;
        }
        postOrderTraversal(RootNode.left);
        postOrderTraversal(RootNode.right);
        System.out.print(RootNode.data+" ");
    }
}




/*
Postorder traversal
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a binary tree, with root 1, print the postorder traversal of the tree.
Algorithm Postorder(tree)
1. Traverse the left subtree
2. Traverse the right subtree
3. Visit the root
Input
The input consists of N+1 lines.
First line contains the integer N, denoting the number of nodes in the binary tree.
Next N lines contains two integers denoting the left and right child of the i'th node respectively.
If the node doesn't have a left or right child, it is denoted by '-1'

1 <= N <= 100000
Output
Print a single line containing N space separated integers representing the postorder traversal of the given tree
Example
Sample Input 1:
5
2 4
5 3
-1 -1
-1 -1
-1 -1
Sample output 1:
5 3 2 4 1

Explanation: Given binary tree
1
/ \
2 4
/ \
5 3

 */