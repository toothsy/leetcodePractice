import java.util.ArrayList;
import java.util.HashMap;

public class longestRepeatingSub {
    public static int LongestRepeatingSubsequence(String s1){
        int len = s1.length();
        int [][] dp = new int[len+1][len+1];// same string twice

        for(int i =1;i<=len;i++){
            for(int j =1;j<=len;j++){
                if(s1.charAt(i-1)==s1.charAt(j-1)&&i!=j)
                    //same char should not be counted
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Integer.max(dp[i-1][j],dp[i][j-1]);

            }
        }
        return dp[len][len];
    }

    public static void main(String[] args) {
        String q = "jxyrnbvtfc";
        System.out.println(LongestRepeatingSubsequence(q));

    }

}
