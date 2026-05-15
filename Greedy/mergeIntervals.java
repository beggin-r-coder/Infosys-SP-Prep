package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1,3}, {2,6}, {8,10}, {15,18}};
        Arrays.sort(arr, (a,b) -> a[0]-b[0]);
        int currentEnd = arr[0][1];
        int start = arr[0][0];
        List<List<Integer>> ans = new ArrayList<>();
    
        for(int i = 1; i<arr.length; i++){
            if(arr[i][0]<=currentEnd)
                currentEnd = Math.max(currentEnd, arr[i][1]);
            else{
                List<Integer> current_interval = new ArrayList<>();
                current_interval.add(start);
                current_interval.add(currentEnd);
                ans.add(current_interval);
                start = arr[i][0];
                currentEnd = arr[i][1];
            }
        }
        List<Integer> final_interval = new ArrayList<>();
        final_interval.add(start);
        final_interval.add(currentEnd);
        ans.add(final_interval);
        System.out.println(ans);
    }    
}