package Dynamic_Programming.Tabulation;

public class distinctSubsequences {
    public static void main(String[] args) {
        String s1 = "babgbag";
        String s2 = "bag";
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for(int i = 0; i<dp[0].length; i++)
            dp[0][i] = 0;
        for(int i = 0; i<dp.length; i++)
            dp[i][0] = 1;
        for(int i = 1; i<=s1.length(); i++){
            for(int j = 1; j<=s2.length(); j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        System.out.println(dp[s1.length()][s2.length()]);
    }
}