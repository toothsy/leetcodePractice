public class minPath {
    public static int mp(int[][] grid){
    int size = grid.length;
    int[][] dp = new int[size+1][size+1];
    dp[1][1] = grid[0][0];
    for(int i = 1;i<=size;i++){
        for(int j = 1;j<=size;j++){
                int cost = grid[i - 1][j - 1];
                if((i-1)==0&&(j-1)!=0){
                    dp[i-1][j] = grid[i-1][j-1];
                }

                else if((i-1)!=0&&(j-1)==0){
                    dp[i][j-1] = grid[i-1][j-1];

                }
                else if((i-1)==0&&(j-1)==0){
                    dp[i-1][j-1] = grid[i-1][j-1];

                }
               else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + cost;
                }

        }
    }
    return dp[size][size];
    }
    public static void main(String[] args) {
        System.out.println(mp(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
    }
}
