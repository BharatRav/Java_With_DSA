package LinkedList.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/reverse-linked-list/description/?envType=study-plan&id=level-1
public class ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode temp=head;
        ListNode prev=null;
        if (head==null){
            return head;
        }
        while(curr.next!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        //after while loop my final curr= 5 prev =4
        curr.next=prev;
        head=curr;
        return head;
    }
}
