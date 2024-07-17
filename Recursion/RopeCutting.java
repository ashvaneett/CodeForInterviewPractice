package Recursion;

public class RopeCutting {

    private static int maxCut(int n,int a,int b,int c){
        if(n<0){
            return -1;
        }
        else if(n==0){
            return 0;
        }
        else{
            return 1+Math.max(maxCut(n-a, a, b, c),Math.max(maxCut(n-b, a, b, c),maxCut(n-c, a, b, c)));
        }
    }

    public static void main(String[] args) {
        int a=11,b=9,c=12;
        int n=24;
        System.out.println(maxCut(n, a, b, c));
        
    }
    
}
