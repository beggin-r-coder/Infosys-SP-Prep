package Dynamic_Programming.Tabulation;

public class longestPalindromeSequence {
    public static void main(String[] args) {
        String str = "bbbab";
        String rev_str = new StringBuilder(str).reverse().toString();
        int[][] dp = new int[str.length()+1][str.length()+1];
        for(int i = 1; i<=str.length(); i++){
            for(int j = 1; j<=str.length(); j++){
                if(str.charAt(i-1)==rev_str.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1]+1;
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        System.out.println(dp[str.length()][str.length()]);
    }
}
