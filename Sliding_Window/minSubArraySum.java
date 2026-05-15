package Sliding_Window;

public class minSubArraySum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int min_length = Integer.MAX_VALUE;

        while(right<arr.length){
            if(sum<target){
                if(right==arr.length-1)
                    break;
                right++;
                sum+=arr[right];
            }else{
                min_length = Math.min(min_length, right-left+1);
                sum-=arr[left];
                left++;
            }
        }
        if(min_length==Integer.MAX_VALUE)
            System.out.println(0);
        else
            System.out.println(min_length);
    }
}
