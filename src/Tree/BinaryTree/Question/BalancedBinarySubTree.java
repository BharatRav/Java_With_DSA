package Tree.BinaryTree.Question;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class BalancedBinarySubTree {
    static class Node {
        int data;
        Node left,right;
        Node(int data) {
            this.data= data;
            left=null;
            right=null;
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] arr = new Node[n+1];
        for(int i=1;i<=n;i++){
            arr[i] = new Node(i);
        }

        for(int i=1;i<=n;i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            arr[i].left=(l==-1)?null:arr[l];
            arr[i].right=(r==-1)?null:arr[r];
        }

        int result = findBalancedSubtrees(arr[1]);
        System.out.println(subtreeCount);
    }
    static int subtreeCount=0;
    private static int findBalancedSubtrees(Node currentNode) {
        int MaxHeight = 0;
        if(currentNode!=null) {
            int leftHeight = findBalancedSubtrees(currentNode.left);
            int rightHeight = findBalancedSubtrees(currentNode.right);

            if(Math.abs(leftHeight-rightHeight)<=2) {
                subtreeCount++;
            }
            return leftHeight+rightHeight+1;
        }
        return MaxHeight;
    }
}