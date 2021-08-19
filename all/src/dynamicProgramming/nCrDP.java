public class nCrDP {
    public static void main(String[] args) {
        int n = 15;
        int r =3;
        System.out.println(nCr(n,r));
    }
    static String nCr(int n, int r){
        // code here
        if(r>n)
            return "0";
        if(r==n)
            return "1";
        java.math.BigInteger[] memo = new java.math.BigInteger[n+1];
        java.math.BigInteger N = java.math.BigInteger.valueOf(n);
        java.math.BigInteger I = java.math.BigInteger.ONE;
        memo[0] = java.math.BigInteger.ONE;
        memo[1] = java.math.BigInteger.ONE;

        for(int i=2;i<n+1;i++){
            I = I.multiply(java.math.BigInteger.valueOf(i));
            memo[i] = I;
        }
        java.math.BigInteger num = memo[n];
        java.math.BigInteger den = memo[n-r].multiply(memo[r]);
        return num.divide(den).mod(java.math.BigInteger.valueOf(10000000007L)).toString();
    }
}

