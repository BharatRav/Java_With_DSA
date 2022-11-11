package Tree.BinaryTree.Leetcode;

import java.util.LinkedList;
import java.util.Queue;

// Leetcode Link: https://leetcode.com/problems/invert-binary-tree/
public class InvertBinaryTree {
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
    public TreeNode invertTree(TreeNode root) {
        if(root== null) {
            return root;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if(temp.left!=null) {
                queue.add(temp.left);
            }
            if (temp.right!=null) {
                queue.add(temp.right);
            }
            TreeNode swap =temp.left;
            temp.left = temp.right;
            temp.right = swap;
        }

        return root;
    }
}
