package Tree.BinaryTree.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/description/
public class MaximumProductOfSplittedBinaryTree {
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

    static long sum ;
    static long maxProd;

    private static  void dfs(TreeNode root) {
        if (root == null) return;
        sum+=(long)root.val;

        dfs(root.left);
        dfs(root.right);

    }

    private static  long checkMax(TreeNode root) {
        if (root == null) return 0;
        long l = checkMax(root.left);
        long r = checkMax(root.right);

        maxProd = Math.max(maxProd,(l+r+root.val)*(sum-l-r-root.val));
        return l+r+root.val;
    }
    public int maxProduct(TreeNode root) { //main function
        //this is two pass postorder solution
        sum=0;
        maxProd=0;
        dfs(root);
        long rootProd = checkMax(root);
        return (int)(maxProd% ((int)Math.pow(10,9)+7));
    }
}
