package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        HashSet<Integer> set = new HashSet<>(Arrays.stream(arr).boxed().toList());
        int max = 0;
        for(int elem : arr){
            int curr_length = 1;
            if(set.contains(elem-1)){
                continue;
            }
            else{
                while(set.contains(elem+1)){
                    elem++;
                    curr_length++;
                }
            }
            max = Math.max(max,curr_length);
        }
        System.out.println(max);
    }
}
