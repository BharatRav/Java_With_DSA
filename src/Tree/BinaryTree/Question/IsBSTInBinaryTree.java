package Tree.BinaryTree.Question;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class IsBSTInBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    //input line 1

        Map<Integer, Node> hm = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            hm.put(i, new Node(sc.nextInt()));      //input line 2
        }

        //input line 3
        int rootNodeIndex = sc.nextInt();


        //taking next n lines containing left and right
        Node currentNode;
        for (int i = 1; i <= n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            //we know all nodes hav already exist in HashMap
            currentNode = hm.get(i);
            if (l != 0) {
                currentNode.left = hm.get(l);
            }
            if (r != 0) {
                currentNode.right = hm.get(r);
            }
        }

        //calling Inorder to check is it construct or not
        //Inorder(hm.get(rootNodeIndex));

        System.out.print(IsBST(hm.get(rootNodeIndex)) ? "YES" : "NO");
    }

    private static boolean IsBST(Node root) {
        boolean result = isValidBSTHelper(root, null, null);
        return result;
    }

    private static boolean isValidBSTHelper(Node currentNode, Integer min, Integer max) {
        boolean leftStatus = true;
        boolean rightStatus = true;

        if (currentNode != null) {
            if (min != null && currentNode.data <= min) {
                return false;
            }

            if (max != null && currentNode.data >= max) {
                return false;
            }

            leftStatus = isValidBSTHelper(currentNode.left, min, currentNode.data);
            rightStatus = isValidBSTHelper(currentNode.right, currentNode.data, max);
        }

        return (leftStatus && rightStatus);
    }
}




/*
Is BST?
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a binary tree with n nodes (numbered from 1 to n) having weight wi and left and right children (li, ri), find whether the given tree is BST or not.
Input
The first line of the input contains an integer n, the number of nodes in the tree.
The second line of input contains n integers, the values of the nodes of the tree.
The third line of the input contains an integer, denoting the root node of the tree.
Next n lines contain two integers l, r denoting the left and right child of the tree. (The value is 0 if there is no left or right child)

Constraints
1 <= n <= 50000
0 <= l, r <= n (0 denotes no child)
1 <= w <= 1000000000
Output
Output "YES" if the given tree is BST, else output "NO"
Example
Sample Input
5
10 3 9 2 1
4
3 0
0 0
2 0
5 1
0 0

Sample Output
YES
 */
