package Tree.BinaryTree;

import java.util.Scanner;

public class BinaryTreeInsertionStaticData {
    Node rootNode;
    static class Node {
        int data;
        Node leftChild,rightChild;
        Node (int data) {
            this.data = data;
            leftChild =rightChild =null;
        }
    }

    public static void main(String[] args) {
        BinaryTreeInsertionStaticData bt = new BinaryTreeInsertionStaticData();

        //level 0
        bt.rootNode =new Node(10);

        //level 1
        bt.rootNode.leftChild = new Node(20);
        bt.rootNode.rightChild = new Node(30);

        //level 2
        bt.rootNode.leftChild.leftChild = new Node(40);
        bt.rootNode.leftChild.rightChild = new Node(50);
        bt.rootNode.rightChild.leftChild = new Node(60);
        bt.rootNode.rightChild.rightChild = new Node(70);
    }
}
