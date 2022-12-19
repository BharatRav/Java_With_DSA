package LinkedList.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/reverse-linked-list-ii/
public class ReverseLinkedListII {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head ==null || left == right) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next =head;
        ListNode oneBefore =dummy;
        ListNode curr= head;
        for (int i=1 ; i<left;i++) {
            oneBefore = curr;
            curr = curr.next;
        }

        ListNode prev = null;

        for (int i=left;i<= right;i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode temp  = oneBefore.next;
        oneBefore.next = prev;
        temp.next =curr;

        return  dummy.next;
    }
}
