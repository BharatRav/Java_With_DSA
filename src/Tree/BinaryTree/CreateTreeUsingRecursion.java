package Tree.BinaryTree;

import java.io.IOException;
import java.util.Scanner;

public class CreateTreeUsingRecursion {

    /*
    if i want all element added only one time then i use this approach dynamically,
    basically the need of this method is for interiew perpose
    creating an tree in a interview question to the graph or any other question in tree
     */

    private static  Node createTree() {
        Node root  = null;
        System.out.println("Enter Data: ");
        int data = sc.nextInt();

        if(data== -1) {
            return null;
        }
        root = new Node(data);
        System.out.println("Enter leftChild for "+data);
        root.leftChild =createTree();
        System.out.println("Enter rightChild for "+data);
        root.rightChild = createTree();

        return root;
    }
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
    }


    static  class Node {
        int data;
        Node leftChild,rightChild;
        Node(int data ){
            this.data = data;
        }
    }

}
