public class lcmN {

    public static int qN(int n1,int n2,int N){
        int lcm ;
        lcm = Math.max(n1, n2);

        // Always true
        while(true) {
            if( lcm % n1 == 0 && lcm % n2 == 0 ) {
                break;
            }
            ++lcm;
        }
        return lcm*N;
    }
    public static void main(String[] args) {
        int a = 4, b = 6;
        System.out.println(qN(a,b,3));
    }

}
