public class primeNumbers {
    public static void main(String[] args) {
        int N = 100;
        boolean[] a = new boolean[N];

        for(int i = 3;i<N;i+=2){
            a[i] = true;
        }

        a[2] = true;

        for(int i = 3;i<N;i+=2){
            if(a[i])
                for(long j = (long) i*i;j<N; j+=i)
                    a[(int) j] = false;


        }
        int count = 0;
        for (int i=0;i<N;i++) {
            if(a[i]) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("count of primes is "+count);

    }

}
