package Recursion;

import java.util.Scanner;

public class CheckIfpali {

    private static boolean ifPali(String s,int st,int e){
        if(st>=e){
            return true;
        }
        else if(s.charAt(st)!=s.charAt(e)){
            return false;
        }
        else{
            return ifPali(s, st+1, e-1);
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int st=0;
        int e=s.length()-1;
        System.out.println(ifPali(s, st, e));
        
    }
    
}
