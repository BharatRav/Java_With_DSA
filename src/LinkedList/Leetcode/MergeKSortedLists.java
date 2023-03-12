package LinkedList.Leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    class Pair {
        int listNo;
        ListNode ptr;
        int val;

        public Pair(int listNo, ListNode ptr, int val) {
            this.listNo = listNo;
            this.ptr = ptr;
            this.val = val;
        }

    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists ==null || lists.length ==0) {
            return null;
        }

        PriorityQueue<Pair> priorityQueue= new PriorityQueue<Pair>(lists.length, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.val- o2.val;
            }
        });

        for (int i=0;i< lists.length;i++) {
            if (lists[i]==null) {
                continue;
            }
            priorityQueue.add(new Pair(i, lists[i],lists[i].val));
        }
        ListNode resultLinkedList = new ListNode(0);
        ListNode tail = resultLinkedList;

        while (priorityQueue.size()>0) {
            Pair curr = priorityQueue.poll();
            if (curr.ptr.next!=null) {
                priorityQueue.add(new Pair(curr.listNo,curr.ptr.next, curr.ptr.next.val));
            }
            tail.next =curr.ptr;
            tail =tail.next;
            tail.next=null;
        }
        return resultLinkedList.next;

    }
}
