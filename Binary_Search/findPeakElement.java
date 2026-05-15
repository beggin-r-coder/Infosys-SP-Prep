package Binary_Search;

public class findPeakElement {
    public static void main(String[] args) {
        int[] arr = {1,3,8,12,4,2};
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int mid = low + (high-low)/2;
            if(arr[mid]<arr[mid+1])
                low = mid+1;
            else
                high = mid;
        }
        System.out.println("Peak found at index "+low);
    }
}
