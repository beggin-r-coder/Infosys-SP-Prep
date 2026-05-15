package Greedy;

import java.util.Arrays;

public class jobScheduling {
    public static void main(String[] args) {
        int[] deadline = {2, 1, 2, 1, 3};
        int[] profit = {100, 19, 27, 25, 15};
        int[][] jobs = new int[deadline.length][2];
        for(int i = 0; i<deadline.length; i++){
            jobs[i][0] = deadline[i];
            jobs[i][1] = profit[i];
        }
        Arrays.sort(jobs, (a,b)->b[1]-a[1]);
        int[] job_list = new int[Arrays.stream(deadline).max().getAsInt()];
        int max_profit = 0;
        for(int i = 0; i<jobs.length; i++){
            int j = jobs[i][0]-1;
            while(j>=0){
                if(job_list[j]==0){
                    job_list[j] = jobs[i][0];
                    max_profit+=jobs[i][1];
                    break;
                }
                else if(j==0 && job_list[j]!=0)
                    break;
                else
                    j--;
            }
        }
        System.out.println("Max Profit : "+max_profit);
        System.out.println(Arrays.toString(job_list));
    }
}
