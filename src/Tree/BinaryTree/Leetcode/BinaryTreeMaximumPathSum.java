package Tree.BinaryTree.Leetcode;

//Leetcode Link:https://leetcode.com/problems/binary-tree-maximum-path-sum/

public class BinaryTreeMaximumPathSum {
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
    int maxValue;

    private  int getMax(TreeNode currentNode) {
        int NodeMax=0;
        if(currentNode!= null) {
            int leftMax = getMax(currentNode.left);
            int rightMax = getMax(currentNode.right);

            NodeMax = Math.max(leftMax, rightMax)+currentNode.val;
            maxValue = Math.max((leftMax+rightMax+currentNode.val),maxValue);
        }
        NodeMax = Math.max(NodeMax,0);
        return NodeMax;
    }

    public int maxPathSum(TreeNode root) {
        maxValue =root.val;

        getMax(root);

        return maxValue;
    }
}
