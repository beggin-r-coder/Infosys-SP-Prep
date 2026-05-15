package Binary_Search;

public class findFirstOccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4,5};
        int target = 2;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                if(mid==0 || arr[mid-1]!=target){
                    System.out.println(mid);
                    break;
                }else{
                    high = mid-1;
                }
            }else if(arr[mid]<target)
                low = mid+1;
            else
                high = mid-1;
        }
    }
}
