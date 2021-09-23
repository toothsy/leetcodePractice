import java.util.Arrays;

public class editDis {
    public static  int editDistance(String s, String t) {

        if(s.equals(t))
            return 0;
        if(s.length()==0||t.length()==0)
            return s.length()==0?t.length():s.length();

        int tlen = t.length(); int slen = s.length();

        int [][] dp = new int[slen+1][tlen+1];

        for(int i = 0;i<=slen;i++){
            for(int j =0;j<=tlen;j++){
                if(i==0)
                    dp[0][j] = j;
                else if( j==0)
                    dp[i][0] = i;
                else if(s.charAt(i-1)!=t.charAt(j-1))
                    dp[i][j] = 1+ min(dp[i-1][j],dp[i][j-1],dp[i-1][j-1]);
                else
                    dp[i][j] = dp[i-1][j-1];
                }
            }
        return dp[slen][tlen];
        }
    static int min(int a, int b, int c){
        int m = Math.min(a,b);
        int n = Math.min(b,c);
        return Math.min(n,m);
    }
    public static void main(String[] args) {
        System.out.println(editDistance("abc","abcd"));
        // char[] al = "ABCD".toCharArray();
        // System.out.println(Arrays.toString(al));

        // System.out.println(al[3]-64);
    }


}

