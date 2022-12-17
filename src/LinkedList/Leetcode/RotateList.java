package LinkedList.Leetcode;
//Leetcode Link:- https://leetcode.com/problems/rotate-list/description/
public class RotateList {

     public class ListNode {
         int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode rotateRight(ListNode head, int k) {
         if (head == null || head.next ==null || k==0) {
             return  head;
         }

         int len =0;
         ListNode prev =null;
         ListNode tail = head;

         while (tail!=null) {
             prev =tail;
             tail = tail.next;
             len++;
         }

         prev.next = head;
         tail =  head;

         k = (len-k%len);

         while (k-->0) {
             prev=tail;
             tail=tail.next;
         }
        prev.next = null;
         return tail;
    }

}
