package LinkedList.Leetcode;


public class MaximumTwinSumOfALinkedlist {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public int pairSum(ListNode head) {
        if (head==null) return 0;
        ListNode dummy = new ListNode(-1);
        dummy.next= head;
        ListNode prev=null,curr=head,temp=head,fast=dummy;

        //curr is like slow and fast is fast
        int max =0;

        while(fast.next!=null) {
            fast =fast.next.next;
            temp= curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }

        //
        while(prev!=null) {
            max = Math.max(prev.val+ curr.val,max);
            prev=prev.next;
            curr=curr.next;
        }


        return max;
    }
}
