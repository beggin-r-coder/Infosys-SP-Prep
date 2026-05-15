package Dynamic_Programming.Recursion;

public class printNto1 {
    public static void display(int n){
        if(n==0)
            return;
        else{
            System.out.println(n);
            display(n-1);
        }       
    }
    public static void main(String[] args) {
        display(10);
    }
}
