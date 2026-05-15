package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,2,1,3};
        HashSet<Integer> set = new HashSet<>(Arrays.stream(arr).boxed().toList());
        if(set.size()!=arr.length)
            System.out.println("Duplicate Value Exists");
        else
            System.out.println("No Duplicate Values Exists");
    }
}
