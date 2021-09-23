import java.sql.SQLOutput;
import java.util.Arrays;


class a{
    static int aliceJog(int n,int[]memo){
        if(n<0)
            return 0;
        else if(n == 0)
            return 1;
        else if(memo[n]>-1)
            return memo[n];
        else{
            memo[n] = (aliceJog(n-1,memo)%1000000007+aliceJog(n-2,memo)%1000000007)%1000000007;
            return memo[n];
        }
    }
}
public class tripleStep {
    static int noOfWays(int inp ){
        int[] memo = new int[inp+1];
        Arrays.fill(memo,-1);
        return a.aliceJog(inp,memo);

    }
    public static int answer(int n){
        if(n==0||n==1) return 1;
        if(n==2||n==3) return n;
        int a=0;
        int b = 1;
        int c = 2;
        int d=0;
        for(int i =2;i<n;i++){
            d = a+b+c;
            a = b;
            b = c;
            c =d;
        }
        return d;
    }
    public static int countWays(int n){
        int[] memo = new int[n+1];
        Arrays.fill(memo,-1);
        return countWays(n,memo);
    }

    private static int countWays(int n, int[] memo) {
        if(n<0)
            return 0;
        else if(n==0)
            return 1;
        else if(memo[n]>-1)
            return memo[n];
        else{
            memo[n]=countWays(n-1,memo)+countWays(n-2,memo)+countWays(n-3,memo);
            return memo[n];
        }
    }
    public static void main(String[] args) {
        int n = 5; // number of steps
//        System.out.println("for n = "+n+"\nyou can go up "+answer(n)+" ways");
//        System.out.println("for n = "+n+"\nyou can go up "+countWays(n)+" ways");
//
//        System.out.println("alice can jog in "+noOfWays(10011));
        int[] memo = new int[100000];
        Arrays.fill(memo,-1);
        System.out.println(countChange(127, memo, 1)-1);
        System.out.println(Arrays.toString(memo));
    }
    private static int countChange(int n, int[] memo, int level) {
        if(n<0)
            return 0;
        else if(n==0)
            return 1;
        else if(memo[n]>-1)
            return memo[n];
        else{
            memo[n]=countChange(n-1,memo,level+1)+countChange(n-(int)Math.pow(6,level),memo,level+1)+countChange(n-(int)Math.pow(9,level),memo,level+1);
            return memo[n];
        }
    }


}
