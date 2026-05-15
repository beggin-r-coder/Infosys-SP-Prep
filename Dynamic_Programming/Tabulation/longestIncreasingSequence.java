package Dynamic_Programming.Tabulation;

import java.util.Arrays;

public class longestIncreasingSequence {
    public static void main(String[] args) {
        int[]arr = {10, 9, 2, 5, 3, 7, 101, 18};
        int[] dp = new int[arr.length];
        for(int i = 0; i<dp.length; i++)
            dp[i] = 1;

        for(int i = 1; i<arr.length; i++){
            for(int j = 0; j<i; j++){
                if(arr[i]>arr[j])
                    dp[i] = Math.max(dp[i], dp[j]+1);
            }
        }
        System.out.println(Arrays.stream(dp).max().getAsInt());        
    }
}
