package Arrays;

import java.util.Arrays;

public class sortColours {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }else if(arr[mid]==2){
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }else
                mid++;
        }
        System.out.println(Arrays.toString(arr));
    }
}