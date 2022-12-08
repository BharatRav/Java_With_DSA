package LinkedList.Leetcode;
//Leetcode Link:- https://leetcode.com/problems/leaf-similar-trees/

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
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

    private  static  void  generate(List<Integer> result,TreeNode currentNode) {
        if (currentNode == null) return;
        if (currentNode.left ==null && currentNode.right == null) {
            result.add(currentNode.val);
            return;
        }
        generate(result,currentNode.left);
        generate(result,currentNode.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        generate(list1,root1);
        generate(list2,root2);

        return list1.equals(list2);
    }
}
