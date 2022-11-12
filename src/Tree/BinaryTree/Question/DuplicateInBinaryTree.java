package Tree.BinaryTree.Question;

import java.util.HashSet;
import java.util.Set;

//in this code there is four method to solve
public class DuplicateInBinaryTree {

    //method 1       DuplicateInBinaryTreeRecursiveUsingSet
    class TreeNode {
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

    Set<Integer> values = new HashSet<>();

    public boolean duplicate(TreeNode root){
        if(root != null) {
            if(values.contains(root.val)) {
                return true;
            }

            values.add(root.val);

            return duplicate(root.left) || duplicate(root.right);
        }

        return false;
    }
}


/*
method 2


public class DuplicateInBinaryTreeIterativeUsingSet {
    class TreeNode {
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

    public boolean duplicate(TreeNode root) {
        if(root != null) {
            Set<Integer> values = new HashSet<>();

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty()) {
                TreeNode temp = queue.poll();
                int val = temp.val;

                if(values.contains(val)) {
                    return true;
                }
                values.add(val);

                if(temp.left != null) {
                    queue.add(temp.left);
                }

                if(temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }

        return false;
    }
}
 */

/*
method 3

public class DuplicateInBinaryTreeIterativeUsingMap {
    class TreeNode {
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

    public boolean duplicate(TreeNode root){
        if(root != null) {
            Map<Integer, Integer> values = new HashMap<>();

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty()) {
                TreeNode temp = queue.poll();
                int val = temp.val;

                if(values.containsKey(val)) {
                    return true;
                }
                values.put(val, 1);

                if(temp.left != null) {
                    queue.add(temp.left);
                }

                if(temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }

        return false;
    }
}
 */




/*
method 4
public class DuplicateByRaja {
    class TreeNode {
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

    Set<Integer> hs = new HashSet<>();
    List<Integer> list = new ArrayList<>();

    public boolean duplicate(TreeNode root){
        if (root == null) {
            return false;
        }

        list.add(root.val);
        hs.add(root.val);

        duplicate(root.left);
        duplicate(root.right);

        if (list.size() > hs.size()) {
            return true;
        }
        else {
            return false;
        }
    }
}
 */














/*
duplicate in Binary tree
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given the root of the binary tree and an integer val. Return true if there exists two nodes with same values.
Input
You don't have to input anything, just complete the given function.

Constrains
1 <= number of nodes <= 105
1 <= value of nodes <= 10 5
Output
Return true or false.
Example
Input:
2 null 2 5 7

Output:
true

Explanation :
There are two nodes with same values as 2.
 */