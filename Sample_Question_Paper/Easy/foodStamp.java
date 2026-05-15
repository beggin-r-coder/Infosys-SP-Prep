package Sample_Question_Paper.Easy;

public class foodStamp {
    public static void main(String[] args) {
        int n = 3;
        int m = 5;
        int[] v = {5,7,9};
        int[] d = {2,4,6};

        int sum = 0;
        for(int i = 0; i<m; i++){
            int max = v[0];
            int max_index = 0;
            for(int j = 0; j<v.length; j++){
                if(max<=v[j]){
                    max = v[j];
                    max_index = j;
                } 
            }
            sum+=max;
            v[max_index] = v[max_index] - d[max_index];
        }
        System.out.println(sum);
    }
}
