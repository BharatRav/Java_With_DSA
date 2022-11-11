package Tree.BinaryTree.Leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//Leetcode Link: https://leetcode.com/problems/maximum-width-of-binary-tree/
public class MaximumWidthOfBinaryTree {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Pair {
        TreeNode currentNode;
        int arrayIndex;
        Pair(TreeNode currentNode, int arrayIndex) {
            this.currentNode = currentNode;
            this.arrayIndex = arrayIndex;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        int maxWidth =0;

        if(root!=null) {
            ArrayDeque<Pair> levelDeque = new ArrayDeque<Pair>();
            // first one adding
            Pair rootNode  = new Pair(root,0);
            levelDeque.add(rootNode);

            while (!levelDeque.isEmpty()) {
                int size = levelDeque.size();

                int IndexOfLastNode = levelDeque.getLast().arrayIndex;
                int IndexOfirstNode = levelDeque.getFirst().arrayIndex;

                int currentWidth = (IndexOfLastNode-IndexOfirstNode)+1;

                maxWidth = Math.max(maxWidth,currentWidth);

                for (int i=0;i<size;i++) {
                    Pair firstNode =levelDeque.poll();
                    TreeNode key = firstNode.currentNode;
                    int value = firstNode.arrayIndex;

                    if (key.left!=null) {
                        int leftChildIndex = value*2 + 1;
                        Pair pair = new Pair(key.left,leftChildIndex);
                        levelDeque.add(pair);
                    }

                    if (key.right!=null) {
                        int rightChildIndex = value*2 + 2;
                        Pair pair = new Pair(key.right,rightChildIndex);
                        levelDeque.add(pair);
                    }
                }
            }

        }
        return maxWidth;
    }
}
