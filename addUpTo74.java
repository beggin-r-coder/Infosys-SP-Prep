import java.util.HashMap;

public class addUpTo74 {
    public static void main(String[]args){
        int[] arr = {
                        12, 25, 49, 30, 44, 18, 56, 20, 54, 10,
                        37, 27, 47, 14, 60, 8, 66, 22, 52, 33,
                        41, 5, 69, 15, 59, 11, 63, 24, 50, 35,
                        39, 17, 57, 9, 65, 21, 53, 31, 43, 6,
                        68, 16, 58, 13, 61, 19, 55, 23, 51, 7,
                        67, 26, 48, 28, 46, 29, 45, 32, 42, 34,
                        40, 36, 38, 1, 73, 2, 72, 3, 71, 4,
                        70, 62, 64, 74, 75, 76, 77, 78, 79, 80,
                        81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                        91, 92, 93, 94, 95, 96, 97, 98, 99, 100
                    };

        int target = 74;
        int count = 0;
                    
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(map.containsKey(target-arr[i])){
                count++;
                System.out.println("["+arr[i]+","+(target-arr[i])+"]" +" -> "+ "Index : "+map.get(target-arr[i])+" and "+i);
            }
            map.put(arr[i], i);
        }
        if(!(count>0))
            System.out.println("No Pair Found");
        else
            System.out.println("Total Count of Pairs : "+count);
    }
}
