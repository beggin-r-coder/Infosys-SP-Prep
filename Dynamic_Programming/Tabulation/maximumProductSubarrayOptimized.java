package Dynamic_Programming.Tabulation;

public class maximumProductSubarrayOptimized {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        int min = arr[0];
        int max = arr[0];
        int result = arr[0];
        for(int i = 1; i<arr.length; i++){
            int temp_min = min;
            int min_val = Math.min(arr[i]*max, arr[i]);
            min = Math.min(arr[i]*min, min_val);

            int max_val = Math.max(arr[i]*max, arr[i]);
            max = Math.max(arr[i]*temp_min, max_val);

            result = Math.max(max, result);
        }
        System.out.println(result);
    }
}
