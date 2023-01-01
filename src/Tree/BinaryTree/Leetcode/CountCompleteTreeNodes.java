package Tree.BinaryTree.Leetcode;

public class CountCompleteTreeNodes {
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

    //T(n) = O(lon(n)^2);

    public  int height(TreeNode root) {
        return  root == null ? -1 :1 +height(root.left);
    }
    public int countNodes(TreeNode root) {
        int h = height(root);

        return h < 0 ? 0:
                height(root.right) == h-1 ? (1 << h)+ countNodes(root.right)
                                            : (1 << h-1) +countNodes(root.left);
    }
}
