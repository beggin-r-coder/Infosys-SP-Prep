package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static void main(String[] args) {
        int[]arr = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int target = 0;

        for(int i = 0; i<arr.length-2; i++){
            int left = i+1;
            int right = arr.length-1;
            if(i>0 && arr[i]==arr[i-1])
                continue;
            else{
                while(left<right){
                        int sum = arr[left]+arr[right];
                        if((sum+arr[i])==target){
                            List<Integer> elems = new ArrayList<>();
                            elems.add(arr[i]);
                            elems.add(arr[left]);
                            elems.add(arr[right]);

                            list.add(elems);

                            left++;
                            right--;

                            while(left<right && arr[left]==arr[left-1])
                                left++;
                            while(right>left && arr[right]==arr[right+1])
                                right--;
                        }
                        else if((sum+arr[i])<target)
                            left++;
                        else
                            right--;
                }
            }
        }
        System.out.println(list);
    }
}
