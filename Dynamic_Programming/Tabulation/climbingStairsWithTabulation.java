package Dynamic_Programming.Tabulation;

public class climbingStairsWithTabulation {
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        int steps = 0;
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        if(n<=2) System.out.println(dp[n]);
        else{
            for(int i = 3; i<=n; i++){
                steps = dp[i-1] + dp[i-2];
                dp[i] = steps;
            }
            System.out.println(steps);
        }
    }
}
