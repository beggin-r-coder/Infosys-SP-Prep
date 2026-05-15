package Dynamic_Programming.Tabulation;

import java.util.Arrays;

public class decode {
    public static void main(String[] args) {
        String[] arr = {"1","1","1","1"};
        int[] dp = new int[arr.length];
        dp[0] = 1;
        dp[1] = 2;

        for(int i = 2; i<arr.length; i++){
            int val = Integer.parseInt(arr[i-1].concat(arr[i]));
            if(!arr[i].equals("0"))
                dp[i]+=dp[i-1];
            if(val<=26 && !arr[i-1].equals("0"))
                dp[i]+=dp[i-2];
        }
        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}
