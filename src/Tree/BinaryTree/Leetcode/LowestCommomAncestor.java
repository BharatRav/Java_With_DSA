package Tree.BinaryTree.Leetcode;
//Leetcode Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/
public class LowestCommomAncestor {
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root == p || root == q ) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left!= null && right!= null) return root;
        return left!=null? left:right;
    }
}

