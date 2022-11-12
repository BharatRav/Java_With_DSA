package Tree.BinaryTree.Leetcode;
//Leetcode Linkk: Leetcode Link: https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
import java.util.LinkedList;
import java.util.Queue;


public class SerializeAndDeserializerBinaryTree {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    private  final String delimeter =",";
    private final String NULL_NODE = "null";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();

            if (temp == null) {
                sb.append(NULL_NODE).append(delimeter);
            } else {
                sb.append(temp.val).append(delimeter);
                queue.add(temp.left);
                queue.add(temp.right);
            }
        }
        return sb.toString();

    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data =="") {
            return null;
        }

        String[] dataArray = data.split(delimeter);
        TreeNode root = new TreeNode(Integer.parseInt(dataArray[0]));

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        for (int i=1;i<dataArray.length;i++) {
            TreeNode currentNode =queue.poll();

            if (!dataArray[i].equals(NULL_NODE)) {
                TreeNode leftChild = new TreeNode(Integer.parseInt(dataArray[i]));
                currentNode.left =leftChild;

                queue.add(leftChild);
            }

            if (!dataArray[++i].equals(NULL_NODE)) {
                TreeNode rightChild = new TreeNode(Integer.parseInt(dataArray[i]));
                currentNode.right = rightChild;

                queue.add(rightChild);
            }
        }

        return root;
    }
}
