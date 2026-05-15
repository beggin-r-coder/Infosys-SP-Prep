package Sample_Question_Paper.Easy;

import java.util.PriorityQueue;
import java.util.Queue;

public class foodStampOptimized {
    public static void main(String[] args) {
        int n = 3;
        int m = 5;
        int[] v = {5,7,9};
        int[] d = {2,4,6};

        int[][] food = new int[v.length][2];
        for(int i = 0; i<v.length; i++){
            food[i][0] = v[i];
            food[i][1] = d[i];
        }

        Queue<int[]> pq = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        int sum = 0;
        for(int i = 0; i<food.length; i++)
            pq.add(food[i]);

        for(int i = 0; i<m; i++){
            int[] curr = pq.poll();
            sum+=curr[0];
            curr[0] = curr[0]-curr[1];
            if(curr[0]>0)
                pq.add(curr);
        }
        System.out.println(sum);
    }
}