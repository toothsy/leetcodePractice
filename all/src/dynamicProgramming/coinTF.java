public class coinTF {
    public static long count(int S[], int size, int n) {
        long[][] dp = new long[size+1][n+1];
        for(int i=0;i<=size;i++){
            dp[i][0] =1;
        }
        for(int i = 1;i<=size;i++){
            for(int j =1;j<=n;j++){
                if(S[i-1]>j)
                    dp[i][j] = dp[i-1][j];

                else{
                    dp[i][j] =  dp[i][j-S[i-1]]+dp[i-1][j];
                }
            }

        }
        return dp[size][n] ;
    }

    public static void main(String[] args) {
        int n =4;
        int m =3;
        int[] S = new int[]{1,2,3};
        System.out.println(count(S,m,n));
        n=9;
        m=8;
        int[] s = new int[]{5, 6, 7, 9, 11, 12, 13, 15};
        System.out.println(count(s,m,n));
    }
}
