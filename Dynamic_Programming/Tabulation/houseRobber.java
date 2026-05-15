package Dynamic_Programming.Tabulation;

public class houseRobber {
    public static void main(String[] args) {
        int arr[] = {2, 7, 9, 3, 1};
        int dp[] = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
    
        for(int i = 2; i<arr.length; i++){
            dp[i] = Math.max(arr[i]+dp[i-2], dp[i-1]);
        }
        System.out.println(dp[dp.length-1]);
    }
}
