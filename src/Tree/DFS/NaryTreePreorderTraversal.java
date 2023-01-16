package Tree.DFS;

import Tree.Graph.Leetcode.NumberOfGoodPath;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Leetcode Link:-https://leetcode.com/problems/n-ary-tree-preorder-traversal/?envType=study-plan&id=level-1
public class NaryTreePreorderTraversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    //Method iterative
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<Node> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            Node current = st.pop();
            res.add(current.val);
            for (int i=current.children.size()-1;i>=0;i--) {
                st.push(current.children.get(i));
            }
        }
        return res;
    }

    //Method recursive
//    public List<Integer> list = new ArrayList<>();
//    public List<Integer> preorder(Node root) {
//        if (root == null)
//            return list;
//
//        list.add(root.val);
//        for(Node node: root.children)
//            preorder(node);
//
//        return list;
//    }
}
