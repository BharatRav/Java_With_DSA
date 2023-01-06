package LinkedList.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/linked-list-cycle-ii/description/?envType=study-plan&id=level-1
public class LinkedListCycleII {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public ListNode detectCycle(ListNode head) {
        ListNode slow =head;
        ListNode fast = head;

        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast= fast.next.next;

            if (slow == fast) break;
        }

        if (fast == null || fast.next == null) return null;

        while (head!=slow) {
            head =head.next;
            slow =slow.next;
        }
        return head;
    }

    //deep understanding
    //https://leetcode.com/problems/linked-list-cycle-ii/solutions/1701128/c-java-python-slow-and-fast-image-explanation-beginner-friendly/?envType=study-plan&id=level-1&orderBy=most_votes
}
