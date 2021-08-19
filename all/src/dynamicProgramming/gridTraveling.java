public class gridTraveling {
    private  static  long gridTraveller(int row,int col,long[][] memo){
        if(memo[row][col]!=0){
            return memo[row][col];
        }
        if(row==0||col==0)
            return 0;
        if(row==1&&col==1)
            return 1;
        memo[row][col]  = gridTraveller(row-1,col,memo)+gridTraveller(row,col-1,memo);
        return memo[row][col];
    }
    public static void main(String[] args) {

        int m=18,n = 18;
        long [][]memo = new long[m+1][n+1];
        System.out.println(gridTraveller(18,18,memo));
    }
}
