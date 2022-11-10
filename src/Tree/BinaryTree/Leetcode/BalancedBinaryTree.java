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
        return true;
        //not completed
    }
}
