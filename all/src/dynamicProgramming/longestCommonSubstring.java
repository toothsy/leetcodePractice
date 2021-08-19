public class longestCommonSubstring {

    static  int lcString(String s1,String s2,int n, int m){


        int [][] dp = new int[n+1][m+1];
        int max =0;
        for(int i = 1 ;i<=n;i++) {
            for(int j =1;j<=m;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    max = Math.max(max, dp[i][j]);
                }
                else
                    dp[i][j ] = 0;
            }
        }

        return max;

    }



    public static void main(String[] args) {
        String s1 = "ABC";String s2 = "ACD";
        s1 = "QHNWNKUEWHSQMGBBUQCLJJIVSWMDKQTBXIXMVTRRBLJPTNSNFWZQFJMAFADRRWSOFSBCNUVQHFFBSAQXWPQCAC";
        s2 = "LRBBMQBHCDARZOWKKYHIDDQSCDXRJMOWFRXSJYBLDBEFSARCBYNECDYGGXXPKLORELLNMPAPQFWKHOPKMCO";
        System.out.println(lcString(s1,s2,s1.length(),s2.length()));
    }
}
