package LinkedList.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/middle-of-the-linked-list/submissions/872698163/?envType=study-plan&id=level-1
public class MiddleOfTheLinkedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode middleNode(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
