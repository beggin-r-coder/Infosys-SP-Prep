package Dynamic_Programming.Recursion;

public class sumOfFirstNNums {
    public static int sum_of_n(int n){
        if(n==1)
            return 1;
        else{
            return n + sum_of_n(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(sum_of_n(3));
    }
}
