package recursion;

import java.util.Arrays;

public class stringReversal {
    static void reverseString(char[] s){
        int end  = s.length;
        helper(0,s,end);
    }
    static void helper(int index,char[] s,int end){
        if(index>s.length/2||index<0)return;

        helper(index+1,s,--end);
        swap(s,index,end);
    }
    static void swap(char[] s, int sta,int end){
        char t = s[sta];
        s[sta] = s[end];
        s[end] = t;
    }
    public static void main(String[] args) {
        char[] s = "hello".toCharArray();
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }


}
