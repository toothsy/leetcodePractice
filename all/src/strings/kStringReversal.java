import java.util.Arrays;

public class kStringReversal {
    //reverse k character for every 2k characters
    public static String reverseStr(String s, int k) {
        char[]c = s.toCharArray();

        for(int start =0;start<s.length();start+=2*k){//increment it for step size
            int i = start,j = Math.min(start+k-1,s.length()-1);
            //i will swap k characters for every 2k characters.
            while(i<j)
                swap(c,i++,j--);
        }
        return new String(c);
    }
    public static void  swap(char[]c, int start, int end){
        char t =c[start];
        c[start] = c[end];
        c[end]= t;
    }
    public static void main(String[] args) {
        String s = "abcdefg";
        s = reverseStr(s,2);
        System.out.println(s);
    }

}
