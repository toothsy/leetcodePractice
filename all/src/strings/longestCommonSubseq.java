public class longestCommonSubseq {
    static int lcs(int x, int y, String s1, String s2){

        // your code here
        int[][]matches = new int[x+1][y+1];
        for(int i = 1;i<=x;i++){
            for(int j = 1;j<=y;j++){

                if(s1.charAt(i-1) == s2.charAt(j-1))
                    matches[i][j] = 1 + matches[i-1][j-1];

                else
                    matches[i][j] = Integer.max(matches[i-1][j],matches[i][j-1]);
            }
        }
        // printting the lcs
        StringBuilder sub = new StringBuilder();
        int i =  x;
        int j = y;
        while(i>0 && j>0){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                sub.append(s1.charAt(i-1));
                sub.append(" ");
                i--;j--;
            }
            else{
                if(matches[i][j-1]>matches[i-1][j]) j--;
                else i--;
            }
        }
        System.out.println(sub.reverse());
        return matches[x][y];
    }

    public static void main(String[] args) {
        int x = 27;
        int y = 12;
        String s1 = "GEBEOCFUFTSXDIXTIGSIEZHKCHA";
        String s2 = "DFLILRJQFNXZ";
        System.out.println(lcs(x,y,s1,s2));

    }
}
