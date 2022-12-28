package Heap.Leetcode;

import java.util.PriorityQueue;

//Leetcode Link-https://leetcode.com/problems/remove-stones-to-minimize-the-total/description/
public class RemoveStonesToMinimizeTheTotal {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> b-a);
        int res = 0;
        for (int a: piles) {
            heap.add(a);
            res+=a;
        }
        while (k-->0){
            int a = heap.poll();
            heap.add(a-a/2);
            res-=a/2;
        }
        return res;
        //Tn = O(nlogn);
    }
}
