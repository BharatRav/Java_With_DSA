package Tree.BinarySearchTree.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/minimum-distance-between-bst-nodes/description/
public class MinimumDistanceBetweenBSTNodes {
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
    Integer result = Integer.MAX_VALUE, prev = null;
    public int minDiffInBST(TreeNode root) {
        if (root.left != null) {
            minDiffInBST(root.left);
        }
        if (prev != null) {
            result = Math.min(result, root.val - prev);
        }
        prev = root.val;
        if (root.right != null)  {
            minDiffInBST(root.right);
        }
        return result;
    }
}
