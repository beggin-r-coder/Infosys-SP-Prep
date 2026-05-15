package Dynamic_Programming.Recursion;

public class climbingStairs {
    public static int climb(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else if(n==2)
            return 2;
        else
            return climb(n-1) + climb(n-2);
    }
    public static void main(String[] args) {
        System.out.println(climb(4));
    }
}
