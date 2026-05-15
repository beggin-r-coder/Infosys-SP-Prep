package Greedy;

import java.util.Arrays;

//Greedy Approach
public class activitySelection {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5, 10};
        int[] end = {2, 4, 6, 7, 9, 9, 10};
        int[][] activities = new int[start.length][2];
        for(int i = 0; i<start.length; i++){
            activities[i][0] = start[i];
            activities[i][1] = end[i];
        }
        Arrays.sort(activities,(a,b) -> a[1] - b[1]); //Sort By Ending Time
        int count = 1;
        int lastEnd = activities[0][1];
        for(int i = 1; i<activities.length; i++){
            if(lastEnd<=activities[i][0]){
                count++;
                lastEnd = activities[i][1];
            }
        }
        System.out.println(count);
    }
}