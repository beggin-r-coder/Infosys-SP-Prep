package PrefixSum;

import java.util.HashMap;

public class subArraySumEqualsKPrefixSum {
    public static void main(String[] args) {
        int[]arr = {-1,1,2,3,4,5,6};
        int target = 20;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            sum+=arr[i];
            if(map.containsKey(sum-target))
                count += map.get(sum-target);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);
    }
}
