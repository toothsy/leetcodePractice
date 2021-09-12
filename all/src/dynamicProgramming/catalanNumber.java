import java.math.BigInteger;

public class catalanNumber {
    public static void main(String[] args) {
     int n = 100;
        System.out.println(findCatalan(n));
    }
    public static BigInteger findCatalan(int n)
    {
        //Your code here
        BigInteger[] memo = new BigInteger[2*n+1];
        BigInteger N = BigInteger.valueOf(n);
        BigInteger I = BigInteger.ONE;
        memo[0] = BigInteger.ONE;
        memo[1] = BigInteger.ONE;


        for(int i=2;i<2*n+1;i++){
            I = I.multiply(BigInteger.valueOf(i));
            memo[i] = I;
        }

        BigInteger num = memo[2*n];
//        Integer rem = num.mod(BigInteger.TEN).intValue();
//        num.compareTo(BigInteger.ZERO);
//        num = num.divide()
        BigInteger den = N.add(BigInteger.ONE).multiply(memo[n].multiply(memo[n]));
        return num.divide(den);
    }

}
