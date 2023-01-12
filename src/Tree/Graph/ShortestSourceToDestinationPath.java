package Tree.Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class ShortestSourceToDestinationPath {
    class Coordinates {
        int x;
        int y;
        int steps;
        Coordinates (int x, int y, int steps) {
            this.x = x;
            this.y = y;
            this.steps = steps;
        }
    }
    private int findMinimumSteps(int[][] graph, int x, int y) {
        int direction[][] = {
                {-1, 0},    //up
                {0, 1},    //right
                {1, 0},    // down
                {0,-1}    //left
        };

        if (graph[0][0]!=1 || graph[x][y]!=1) {
            return -1;
        }

        Queue<Coordinates> queue = new LinkedList<>();
        queue.add(new Coordinates(0,0,0));

        int nextRow = 0;
        int nextColumn = 0;

        while (!queue.isEmpty()) {
            Coordinates coord = queue.poll();
            int currentX = coord.x;
            int curretY = coord.y;
            int steps = coord.steps;

            if(currentX == x && curretY == y) {
                return steps;
            }

            for (int i=0; i<direction.length; i++) {
                nextRow = coord.x + direction[i][0];
                nextColumn = coord.y + direction[i][1];

                if(nextRow < 0
                        || nextRow >= graph.length
                        || nextColumn < 0
                        || nextColumn >= graph[0].length
                        || graph[nextRow][nextColumn] != 1) {
                    continue;
                }

                graph[nextRow][nextColumn] = -1;
                queue.add(new Coordinates(nextRow,nextColumn,steps+1));
            }
        }
        return -1;
    }

    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        ShortestSourceToDestinationPath sstd = new ShortestSourceToDestinationPath();

        int n = sc.nextInt();
        int m = sc.nextInt();

        int graph[][] = new int[n][m];

        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        int y = sc.nextInt();

        int result = sstd.findMinimumSteps(graph,x,y);
        System.out.println(result);
    }
}