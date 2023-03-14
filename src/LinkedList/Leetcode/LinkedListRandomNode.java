package LinkedList.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/linked-list-random-node/description/
import java.util.Random;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class LinkedListRandomNode {
     public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    ListNode head;
    Random random;

    public LinkedListRandomNode(ListNode h) {
        head = h;
        random = new Random();
    }

    public int getRandom() {
        ListNode c = head;
        int r = c.val;
        for(int i=1;c.next != null;i++){

            c = c.next;
            if(random.nextInt(i+1) == i) r = c.val;
        }

        return r;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */