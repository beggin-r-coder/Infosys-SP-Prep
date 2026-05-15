package Dynamic_Programming.Tabulation;

public class climbingStairsOptimized {
    public static void main(String[] args) {
        int n = 5;
        int a = 1;
        int b = 2;
        int c = 0;
        for(int i = 3; i<=n; i++){
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
