public class bestTImeToSellStock2 {
    public static int btts(int[] prices){
        int size = prices.length;
        int[][] dp = new int[size][size+1];
        int maxSoFar =0;
        for(int i =1;i<=size;i++){
            for(int j = i+1;j<size;j++ ){
                int prof = Math.max(dp[i-1][j-1],dp[i-1][j]) ;
                int sell = prices[j-1] - prices[i-1];
                dp[i][j] = prof + sell;

                maxSoFar = Math.max(dp[i][j],maxSoFar);
            }
        }
        return maxSoFar;


    }
    public static void main(String[] args) {
        System.out.println(btts(new int[]{1,10,5,10,6,4}));
    }
}
