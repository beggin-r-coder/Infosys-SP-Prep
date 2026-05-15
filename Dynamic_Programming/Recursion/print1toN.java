package Dynamic_Programming.Recursion;

public class print1toN {
    public static void display(int n){
        if(n==0)
            return;
        else{
            display(n-1);
            System.out.println(n);
        }       
    }
    public static void main(String[] args) {
        display(10);
    }
}
