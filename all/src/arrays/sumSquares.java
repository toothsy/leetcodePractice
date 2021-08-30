public class sumSquares {
    public static boolean isPerfect(int c){
        int cr = (int)Math.sqrt(c);
        return ( Math.sqrt(c) - cr)==0.0;

    }

    public static boolean ss(int c){
        if(c<=2) return true;

        int lim = (int)Math.sqrt(c);
        for(int i = 0;i<lim;i++){
            if(isPerfect(c-i*i))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(ss(13));
    }
}
