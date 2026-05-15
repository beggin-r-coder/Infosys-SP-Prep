package Greedy;

import java.util.Arrays;

public class minimumPlatforms {
    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};
        Arrays.sort(arrival);
        Arrays.sort(departure);
        
        int i = 0;
        int j = 0;
        int max_count = 0;
        int count = 0;
        while(i<arrival.length){
            if(arrival[i]<=departure[j]){
                count++;
                max_count = Math.max(max_count, count);
                i++;
            }else{
                count--;
                j++;
            }
        }
        System.out.println(max_count);
    }
}