package Tree.BinaryTree.Leetcode;
//Leetcode Link: https://leetcode.com/problems/diameter-of-binary-tree/

public class DiametreOfBinaryTree {
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

    int Diametre = 0;
    private  int getHeight(TreeNode currentNode) {
        int height =0;
        if(currentNode!=null) {
            int leftHeight = getHeight(currentNode.left);
            int rightHeight = getHeight(currentNode.right);

            height = Math.max(leftHeight,rightHeight)+1;

            Diametre =Math.max(Diametre,(leftHeight+rightHeight));
        }
        return height;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return Diametre;
    }
}
