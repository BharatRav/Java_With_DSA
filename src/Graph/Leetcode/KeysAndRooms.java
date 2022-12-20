package Graph.Leetcode;

import LinkedList.Leetcode.ReverseLinkedListII;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Leetcode Link:-https://leetcode.com/problems/keys-and-rooms/
public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] resultroom = new  boolean[n];

        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(rooms.get(0));
        resultroom[0] =true;

        while (!queue.isEmpty()) {
            List<Integer> temp = queue.poll();
            int size = temp.size();

            for (int i=0;i<size;i++) {
                int data = temp.get(i);

                if (!resultroom[data]) {
                    queue.add(rooms.get(data));
                    resultroom[data] = true;
                }
            }
        }

        for (boolean isOpened: resultroom) {
            if (!isOpened) {
                return false;
            }
        }
        return true;
    }
}

/*
n == rooms.length
2 <= n <= 1000
0 <= rooms[i].length <= 1000
1 <= sum(rooms[i].length) <= 3000
0 <= rooms[i][j] < n
 */
