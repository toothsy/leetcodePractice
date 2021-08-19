public class knapSackTF {
    static int knapSack(int W, int wt[], int val[], int n) {
        int [][] dp = new int[n+1][W+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){
                    if(wt[i-1]>j)

                        dp[i][j] =dp[i - 1][j];

                    else {
                        dp[i][j] = Integer.max(dp[i - 1][j - wt[i-1]] + val[i-1], dp[i - 1][j]);
                    }
            }
        }
        return dp[n][W];

    }
    public static void main(String[] args) {
        int W = 4;
        int n =3;
        int[] wt = new int[]{4,5,1};
        int[] profit = new int[]{1,2,3};
        System.out.println(knapSack(W,wt,profit,n));
        W=58;
        n=41;
        int[] wei = new int[]{57, 95, 13, 29, 1, 99, 34, 77, 61, 23, 24, 70, 73, 88, 33, 61, 43, 5, 41, 63, 8, 67, 20,
                72, 98, 59, 46, 58, 64, 94, 97, 70, 46, 81, 42, 7, 1, 52, 20, 54, 81, 3, 73, 78, 81, 11, 41, 45, 18, 94,
                24, 82, 9, 19, 59, 48, 2, 72};
        int[] pr = new int[]{83, 84, 85, 76, 13, 87, 2, 23, 33, 82, 79, 100, 88, 85, 91, 78, 83, 44, 4, 50, 11, 68, 90,
                88, 73, 83, 46, 16, 7, 35, 76, 31, 40, 49, 65, 2, 18, 47, 55, 38, 75, 58, 86, 77, 96, 94, 82, 92, 10, 86,
                54, 49, 65, 44, 77, 22, 81, 52};

        System.out.println(knapSack(W,wei,pr,n));
    }
}
