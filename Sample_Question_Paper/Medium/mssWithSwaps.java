package Sample_Question_Paper.Medium;

import java.util.PriorityQueue;
import java.util.Queue;

public class mssWithSwaps {
    public static void main(String[] args) {
        int k = 1;
        int[] arr = {-5,-2,-5};
        int result = Integer.MIN_VALUE;
        for(int l = 0; l<arr.length; l++){
            Queue<Integer> min_heap = new PriorityQueue<>();
            Queue<Integer> max_heap = new PriorityQueue<>((a,b)->b-a);
            int curr_sum = 0;
            
            for(int r = l; r<arr.length; r++){
                curr_sum+=arr[r];
                if(arr[r]<0)
                    min_heap.add(arr[r]);
                for(int i = 0; i<arr.length; i++){
                    if(i>=l && i<=r)
                        continue;
                    if(arr[i]>0)
                        max_heap.add(arr[i]);
                }
                int temp_sum = curr_sum;
                int swaps = k;
                while(swaps>0 && !min_heap.isEmpty() && !max_heap.isEmpty()){   
                    temp_sum += (max_heap.poll() - min_heap.poll());
                    swaps--; 
                }
                max_heap.clear();
                result = Math.max(temp_sum, result);
            }
        }
        System.out.println(result);
    }    
}
