import java.util.Arrays;

public class kmp {
    // longest prefix with same suffix
    /**
     *calculates the longest prefix with common suffix
     *
     * @param p pattern string
     * @return array containing the lps data
     */


    public static int[] lpsArr(String p){
        int []arr = new int[p.length()];
        int i=0;
        for(int j =1;j<p.length();j++){
            if(p.charAt(i) == p.charAt(j)){
                i++;
            }
            else{
                if(i-1<0) i++;
                i = arr[i-1];
            }
                arr[j] = i;
        }
        return arr;
    }

    public static int search(String s,String pattern){
        int[] lps = lpsArr(pattern);
        System.out.println(Arrays.toString(lps));
        int ans = -1;
        int j = 0;
        for(int i = 0;i<s.length();){
            if(s.charAt(i) == pattern.charAt(j)){i++;j++;}
            if(j == pattern.length()){
                ans = i-j;
                break;
            }
            else if (i < s.length() && pattern.charAt(j) != s.charAt(i)){
                if( j != 0) j = lps[j-1];
                else i+=1;
            }
        }


        return  ans;
    }
    public static void main(String[] args) {
        String pattern = "abszdfg";
        String s = "absadfzdfgdfgabsabszdfg";
        System.out.println("start index is "+search(s,pattern));

    }
}
