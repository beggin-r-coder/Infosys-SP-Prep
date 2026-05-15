package Dynamic_Programming.Memoization;

public class climbingStairsWithMemoization {
    public static int climb(int n, int dp[]){
        if(n==1)return 1;
        if(n==2)return 2;

        if(dp[n]!=0)
            return dp[n];
        else{
            dp[n] = climb(n-1, dp) + climb(n-2, dp);
            return dp[n];
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
        System.out.println(climb(n, dp));
    }
}
