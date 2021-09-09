import java.util.HashMap;
import java.util.TreeMap;

public class reverseWordsWithSpace {
    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int start,end,traverser;
        start = end = traverser = 0;

        while(traverser<chars.length){
            if(chars[traverser]!=' '){
                traverser++;
                end++;
            }
            else{
                swap(start,end-1,chars);
                start = end = ++traverser;
            }
            // System.out.println(new String(chars));
        }
        swap(start,end-1,chars);
        return new String(chars);

    }
    static void swap(int start, int end , char[] chars){
        while(start<end){
            char t = chars[start];
            chars[start] = chars[end];
            chars[end] = t;
            start++;end--;
        }

    }

    public static void main(String[] args) {
//        assert 1==1;
        System.out.println(reverseWords("Hello there General Kenobi"));
//        System.out.println(Math.log1p(64));

    }
}
