package LinkedList.Question;

public class FindTheFirstNodeOfLoopInLinkedList {
    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }
    public static int findFirstNode(Node head){
        //code here
        if (head==null) return 0;

        Node slow=head,fast=head;

        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) break;
        }
        if (slow!=fast) return -1;

        while (head!=slow) {
            head=head.next;
            slow=slow.next;
        }
        return slow.data;
    }
}
