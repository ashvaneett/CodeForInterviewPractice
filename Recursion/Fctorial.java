package Recursion;

public class Fctorial {
    private static int fact(int n){
        if(n<=1){
            return n;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {

        int n=3;
        System.err.println(fact(n));
        
    }
    
}
