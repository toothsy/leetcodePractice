import java.util.Arrays;

public class tripleStep {
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
        System.out.println("for n = "+n+"\nyou can go up "+countWays(n)+" ways");

    }
}
