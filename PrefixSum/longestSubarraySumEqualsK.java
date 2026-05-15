package PrefixSum;

import java.util.HashMap;

public class longestSubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefix_sum = 0;
        int max_len = 0;
        for(int i = 0; i<arr.length; i++){
            prefix_sum+=arr[i];
            if(prefix_sum==k)
                max_len = i+1;
            if(map.containsKey(prefix_sum-k))
                max_len = Math.max(max_len, i - map.get(prefix_sum-k));
            else
                map.put(prefix_sum, i);
        }
        System.out.println(max_len);   
    }
}
