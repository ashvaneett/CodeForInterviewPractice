package Recursion;

public class GenerateSubSequence {

    private static void generate(String s,int st,String res){
        if(st==s.length()){
            System.out.println(res);
        }
        else{
            generate(s, st+1, res+"");
            generate(s, st+1, res+s.charAt(st));
        }

    }

    public static void main(String[] args) {
        generate("abc", 0,"");
        
    }
    
}
