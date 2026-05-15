package Dynamic_Programming.Tabulation;

public class editDistance {
    public static void main(String[] args) {
        String s1 = "horse";
        String s2 = "ros";
        
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for(int i = 0; i<dp.length; i++)
            dp[i][0] = i;
        for(int i = 0; i<dp[0].length; i++)
            dp[0][i] = i;

        for(int i = 1; i<=s1.length(); i++){
            for(int j = 1; j<=s2.length(); j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                else{
                    int temp = Math.min(dp[i-1][j-1]+1, dp[i][j-1]+1);
                    dp[i][j] = Math.min(dp[i-1][j]+1, temp);
                }   
            }
        }
        System.out.println(dp[s1.length()][s2.length()]);
    }
}