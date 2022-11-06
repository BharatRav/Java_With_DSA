package Tree.BinaryTree.Leetcode;
// Leetcode Link: https://leetcode.com/problems/symmetric-tree/

public class SymmetricTree {
    private class TreeNode {
        int val;
        TreeNode left,right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    private  boolean isSymmetricHelper(TreeNode leftChild, TreeNode rightChild) {
        if (leftChild == null && rightChild == null) {
            return true;
        }
        if (leftChild == null || rightChild == null) {
            return false;
        }
        if (leftChild.val != rightChild.val) {
            return false;
        }
        return isSymmetricHelper(leftChild.left,rightChild.right) &&
                isSymmetricHelper(rightChild.left,leftChild.right);
    }
    public boolean isSymmetric(TreeNode root) {
        if (root ==null) {
            return true;
        }
        return isSymmetricHelper(root.left,root.right);
    }
}
