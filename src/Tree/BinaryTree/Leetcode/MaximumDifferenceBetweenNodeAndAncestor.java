package Tree.BinaryTree.Leetcode;
//Leetcode Link:- https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/

public class MaximumDifferenceBetweenNodeAndAncestor {
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

    public int maxAncestorDiff(TreeNode root) {
        //very very important question
        return DFS(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private static  int DFS (TreeNode root, int max, int min) {
        if (root == null) return 0;

        max = Math.max(max,root.val);
        min = Math.min(min, root.val);
        return root.left == root.right ? max-min:Math.max(DFS(root.left, max, min), DFS(root.right, max, min));
    }
}
