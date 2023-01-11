package Tree.BinaryTree.Leetcode;
//Leetcode Link: https://leetcode.com/problems/same-tree/description/
public class SameTree {
    public class TreeNode {
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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        //if both false obviously true
        if (p == null && q == null) {
            return true;
        }

        // if both are not true and anyone of them null it means it's false
        if (p == null || q == null) {
            return false;
        }

        //if both have same value
        if (p.val == q.val) {
            boolean leftStatus = isSameTree(p.left,q.left);
            boolean rightStatus = isSameTree(p.right,q.right);

            return (leftStatus && rightStatus);
        }

        //if both not same value but nodes are equal then also it is false
        return false;
    }

}
