package Arrays;

import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {16,4,23,8,15,42,1,2};
        int target = 19;
        boolean flag = false;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            if(map.containsKey(target-arr[i])){
                flag = true;
                System.out.println("["+arr[i]+","+(target-arr[i])+"]");
                 System.out.println("Index : "+i+" and "+map.get(target-arr[i]));
                break;
            }
            map.put(arr[i], i);
        }
        if(!flag)
            System.out.println("Not Found");
    }
}
