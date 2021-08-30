package company;

public class cog {
    static  int countSameHash(int inp){
        int count = 0;

        for(int i = 0 ;i<=inp;i++){
            for(int j = 0;j<=inp;j++){
                if((int)(Math.sqrt(j))==(int)(Math.sqrt(i)))
                    count++;
            }
        }


        return count;

    }
    public static void main(String[] args) {
        System.out.println(countSameHash(4));
    }
}
