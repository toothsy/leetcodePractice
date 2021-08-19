public class bestTImeToSellStock2 {
    public static int btts(int[] prices){
        int size = prices.length;
        int[][] dp = new int[size+1][size+1];
        int maxSoFar =0;
        for(int i =1;i<=size;i++){
            for(int j = i+1;j<size;j++ ){
                dp[i][j] = Math.max(dp[i-1][j+1],dp[i-1][j]) + prices[j] - prices[i];
                maxSoFar = Math.max(dp[i][j],maxSoFar);
            }
        }
        return maxSoFar;


    }
    public static void main(String[] args) {
        System.out.println(btts(new int[]{7,1,5,3,6,4}));
    }
}
