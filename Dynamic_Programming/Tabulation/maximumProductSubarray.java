package Dynamic_Programming.Tabulation;

import java.util.Arrays;

public class maximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};

        int[] min = new int[arr.length];
        int[] max = new int[arr.length];
        min[0] = arr[0];
        max[0] = arr[0];

        for(int i = 1; i<arr.length; i++){
            int min_val = Math.min(arr[i]*max[i-1], arr[i]);
            min[i] = Math.min(arr[i]*min[i-1], min_val);

            int max_val = Math.max(arr[i]*max[i-1], arr[i]);
            max[i] = Math.max(arr[i]*min[i-1], max_val);
        }
        System.out.println(Arrays.stream(max).max().getAsInt());
    }
}
