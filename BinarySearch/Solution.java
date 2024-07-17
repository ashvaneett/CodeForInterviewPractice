package BinarySearch;

import java.util.Stack;

public class Solution {

    public static boolean validString(String pattern){

        Stack<Character> st=new Stack<>();

        for(int i=0;i<pattern.length();i++){
            char temp =pattern.charAt(i);
            if(temp=='(' || temp=='{' ||temp=='[' ){
                st.push(temp);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else if(temp==')' && st.peek()=='('){
                    st.pop();
                }
                else if(temp=='}' && st.peek()=='{'){
                    st.pop();
                }
                else if(temp==']' && st.peek()=='['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty()==true;



    }
    public static void main(String[] args) {
        String patt="({})";
        //validString(patt);
        System.out.println(validString(patt));
    }
    
}
