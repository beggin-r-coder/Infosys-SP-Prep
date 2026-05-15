package Greedy;

import java.util.Arrays;

public class fractionalKnapsack {
    public static void main(String[] args) {
        int[] weight = {10, 20, 30};
        int[] value = {60, 100, 120};
        int capacity = 50;
        double[][] arr = new double[weight.length][3];
        for(int i = 0; i<weight.length; i++){
            arr[i][0]= weight[i];
            arr[i][1] = value[i];
            arr[i][2] = (double)value[i]/(double)weight[i];
        }
        Arrays.sort(arr, (a,b)->(int)(b[2]-a[2]));
        double max_profit = 0;
        double current_cap = 0;
        for(int i = 0; i<arr.length; i++){
            if(current_cap+arr[i][0] > capacity){
                max_profit += ((double)(capacity-current_cap)/arr[i][0])*arr[i][1];
                break;
            }else{
                max_profit += arr[i][1];
                current_cap += arr[i][0];
            }
        }
        System.out.println(max_profit);
    }
}