package Tree.BinaryTree.Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumOfABinaryTree {
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
    public int maxLevelSum(TreeNode root) {
        if(root==null) return 0;

        int maxi=Integer.MIN_VALUE;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level=0;
        int currLevel=1;
        while(!queue.isEmpty()) {
            int size= queue.size();

            int currSum=0;
            for (int i=0;i<size;i++) {
                TreeNode temp = queue.poll();
                currSum+=temp.val;

                if(temp.left!=null) {
                    queue.add(temp.left);
                }

                if(temp.right!=null) {
                    queue.add(temp.right);
                }
            }

            if(currSum>maxi) {
                maxi = Math.max(maxi,currSum);
                level =currLevel;
            }
            currLevel++;
        }
        return level;
    }
}
