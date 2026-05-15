package PrefixSum;

public class subarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 22;
        int i = 0;
        int j = 0;
        int sum = arr[0];
        boolean flag = false;
        while(j<arr.length){
            if(sum<target){
                if(j==arr.length-1)
                    break;
                j++;
                sum+=arr[j];
            }else if(sum>target){
                sum-=arr[i];
                i++;
            }else{
                System.out.println("Found");
                flag = true;
                break;
            }
        }
        if(!flag)
            System.out.println("Not Found");
    }    
}