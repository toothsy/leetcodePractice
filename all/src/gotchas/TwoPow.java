package gotchas;

public class TwoPow {
    public static int ts(int N){
        int num =(int)Math.pow(2,N);
        return num%9==0?9:num%9;
    }
    public static void main(String[] args) {
        System.out.println(ts(8));
    }
}
