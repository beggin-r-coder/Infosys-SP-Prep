package Dynamic_Programming.Tabulation;

public class partitionEqualSubsetSum {
    public static void main(String[] args) {
        int[] arr = {1,5,10,5};
        int sum = 0;
        for(int val : arr)
            sum+=val;
        if(sum%2==0){
            boolean dp[][] = new boolean[arr.length][(sum/2)+1];
            for(int i = 0; i<arr.length; i++)
                dp[i][0] = true;
            dp[0][arr[0]] = true;
            for(int i = 1; i<arr.length; i++){
                for(int j = 1; j<dp[0].length; j++){
                    if(j>=arr[i])
                        dp[i][j] = dp[i-1][j]||dp[i-1][j-arr[i]] ;
                    else
                        dp[i][j] = dp[i-1][j];
                }
            }
            System.out.println(dp[arr.length-1][sum/2]);
        }else{
            System.out.println(false);
        }
    }
}
