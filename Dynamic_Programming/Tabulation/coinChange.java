package Dynamic_Programming.Tabulation;

public class coinChange {
    public static void main(String[] args) {
        int[] arr = {1,2,5};
        int amount = 11;
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for(int i = 1; i<dp.length; i++) dp[i] = Integer.MAX_VALUE;
        for(int coin : arr)
            for(int i = 1; i<dp.length; i++)
                if(i>=coin)
                    if(dp[i - coin] != Integer.MAX_VALUE)
                        dp[i] = Math.min(dp[i],1+dp[i-coin]);
        System.out.println(dp[amount]);
    }
}
