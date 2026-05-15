package Binary_Search;

public class searchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int low = 0;
        int high = arr.length-1;
        boolean flag = false;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                System.out.println("Found at index "+mid);
                flag = true;
                break;
            }
            if(arr[low]<=arr[mid]){
                if(target>=arr[low] && target<arr[mid])
                    high = mid-1;
                else
                    low = mid+1;
            } 
            else{
                if(target>arr[mid] && target<=arr[high])
                    low = mid+1;
                else
                    high = mid-1;
            }
        }
        if(!flag)
            System.out.println("Not Found");
    }
}
