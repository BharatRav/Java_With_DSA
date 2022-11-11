package Tree.BinaryTree.Leetcode;
//Leetcode Link: https://leetcode.com/problems/balanced-binary-tree/
public class BalancedBinaryTree {
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
    public boolean isBalanced(TreeNode root) {
        //i'm considering -1 as !balanced tree apart form it all value will
        //signify that it is a balanced binary tree;
        return (isBalancedHelper(root) != -1);
    }
    private int isBalancedHelper(TreeNode currentNode) {
        if(currentNode == null) {
            return 0;
        }
        int leftHeight = isBalancedHelper(currentNode.left);
        if(leftHeight == -1) {
            return -1;
        }

        int rightHeight = isBalancedHelper(currentNode.right);
        if(rightHeight == -1) {
            return -1;
        }

        if(Math.abs(leftHeight-rightHeight) > 1) {
            return -1;
        }
        return Math.max(leftHeight,rightHeight)+1;
    }
}
