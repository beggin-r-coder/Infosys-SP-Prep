package Easy;

public class checkSorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3,10,5,6};
        boolean flag = true;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                flag = false;
                break;
            }
        }
        System.out.println(flag?"Sorted":"Not Sorted");
    }
}