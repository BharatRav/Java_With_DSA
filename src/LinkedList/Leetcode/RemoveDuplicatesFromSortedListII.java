package LinkedList.Leetcode;
//Leetcode Link:- https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
public class RemoveDuplicatesFromSortedListII {
    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(-101);
        dummy.next = head;
        ListNode curr = dummy;
        ListNode prev =null;

        while (curr!=null && curr.next!=null){
            if (curr.val == curr.next.val){
                int value =curr.val;
                while (curr!=null && curr.val == value) {
                    curr = curr.next;
                }
                prev.next =curr;
            } else {
                prev =curr;
                curr=curr.next;
            }
        }


        return dummy.next;
    }
}
