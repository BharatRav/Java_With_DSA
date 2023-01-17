package LinkedList.Question;
public class DetectLoopInLinkedList {
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    public static boolean detectLoop(Node head){
        if(head == null || head.next==null) {
            return false;
        }

        Node slow=head,fast = head;

        while(fast!=null && fast.next!=null) {
            slow= slow.next;
            fast=fast.next.next;
            if(slow==fast) {
                return true;
            }
        }
        return false;
    }
}
