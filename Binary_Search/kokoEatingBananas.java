package Binary_Search;

import java.util.Arrays;

public class kokoEatingBananas {
    
    public static boolean check(int[] piles, int k, int h){
        int hours = 0;
        for(int val : piles)
            hours += (val+k-1)/k;
        return hours<=h;
    }

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();

        while(low<=high){
            int mid = low + (high-low)/2;
            if(check(piles, mid, h))
                high = mid-1;
            else
                low = mid+1;
        }
        System.out.println(low);
    }
}
