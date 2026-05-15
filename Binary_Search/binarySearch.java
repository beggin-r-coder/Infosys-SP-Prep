package Binary_Search;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9};
        int target = 5;
        int low = 0;
        int high = arr.length-1;
        boolean flag = false;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                System.out.println("Found at index "+mid);
                flag = true;
                break;
            }else if(arr[mid]<target)
                low = mid+1;
            else
                high = mid-1;
        }
        if(!flag)
            System.out.println("Not Found");
    }
}
