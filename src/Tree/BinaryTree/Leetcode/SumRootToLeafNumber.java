package Tree.BinaryTree.Leetcode;

public class SumRootToLeafNumber {
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


    private static int getAllPossibleCases(TreeNode root, int TotalSum) {
        if (root ==null) {
            return TotalSum;
        }

        TotalSum =(TotalSum*10 +root.val);

        if (root.left ==null) {
            return getAllPossibleCases(root.right,TotalSum);
        }
        if (root.right == null) {
            return getAllPossibleCases(root.left,TotalSum);
        }
        return getAllPossibleCases(root.left,TotalSum) +getAllPossibleCases(root.right, TotalSum);

    }
    public int sumNumbers(TreeNode root) {
        if (root ==null) {
            return 0;
        }

        return getAllPossibleCases(root,0);
    }
}
