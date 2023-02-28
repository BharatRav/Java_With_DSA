package Tree.BinaryTree.Leetcode;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//LeetcodeLink:-https://leetcode.com/problems/find-duplicate-subtrees/description/
public class FindDuplicateSubTrees {
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

    Map<String,Integer> map;
    List<TreeNode> result;
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        map =new HashMap<>();
        result =new ArrayList<>();
        traverse(root);
        return result;
    }
    private String traverse(TreeNode root) {
        //base case
        if (root==null) {
            return "";
        }

//        String subTree = "(" + root.val + traverse(root.left) +traverse(root.right)+ ")";
        //this line fails for a case thats why i used left n right in string
        String subTree = "(" + root.val +"left"+ traverse(root.left) +"right"+traverse(root.right)+ ")";

        map.put(subTree,map.getOrDefault(subTree,0)+1);

        if (map.get(subTree)==2) {
            result.add(root);
        }
        return subTree;

    }
}
