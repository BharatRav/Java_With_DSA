package Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImplementationDynamicData {
    Node rootNode;
    static class Node {
        int data;
        Node leftChild,rightChild;
        Node (int data) {
            this.data = data;
            leftChild = rightChild =null;
        }
    }

    private void insertNode (int data) {
        if(rootNode == null) {
            rootNode = new Node(data);
            return;
        }
        Queue<Node> qu = new LinkedList<>();
        qu.add(rootNode);
        while ((!qu.isEmpty())) {
            Node temp = qu.poll();
            if(temp.leftChild== null) {
                temp.leftChild = new Node(data);
                 break;
            } else  {
                qu.add(temp.leftChild);
            }

            if(temp.rightChild ==  null) {
                temp.rightChild = new Node(data);
                break;
            } else  {
                qu.add(temp.rightChild);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeImplementationDynamicData bt = new BinaryTreeImplementationDynamicData();

        for(int i=0;i<10;i++) {
            int randomNumber = (int)(Math.random()*100);
            //random fuction  Returns:
            //a pseudorandom double greater than or equal to 0.0 and less than 1.0.
            bt.insertNode(randomNumber);
        }
    }
}
