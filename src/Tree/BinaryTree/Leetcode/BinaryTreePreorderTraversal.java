package Tree.BinaryTree.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/binary-tree-preorder-traversal/description/

import java.util.*;

public class BinaryTreePreorderTraversal {
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root==null) return res;
        Stack<TreeNode> stack = new Stack<>();
        while (root!=null) {
            res.add(root.val);
            if (root.right!=null) {
                stack.push(root.right);
            }
            root =root.left;
            if (root==null && !stack.isEmpty()) {
                root = stack.pop();
            }

        }
        return res;
    }
}
