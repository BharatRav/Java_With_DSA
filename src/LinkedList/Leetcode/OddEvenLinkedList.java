package LinkedList.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/odd-even-linked-list/

public class OddEvenLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return  null;

        ListNode curr = head;       //for odd index
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;      //for even index

        while (curr.next!=null && curr.next.next!=null) {
            temp.next =curr.next;
            temp =temp.next;

            curr.next = curr.next.next;
            curr =curr.next;
        }

        temp.next = curr.next;
        curr.next =dummy.next;

        return head;
    }
}

/*
2-->1-->3-->5-->6-->4-->7   input
            |
            |
           -_-
2-->3-->6-->7-->1-->5-->4   o/p
 */