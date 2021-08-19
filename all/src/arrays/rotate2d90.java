import java.util.Arrays;

public class rotate2d90 {
    public static void rot90(int[][] a){
        int n = a.length-1;
        for(int i = 0;i<n/2;i++){
            for(int j = i;j<n-i;j++){
                int t = a[i][j];
                a[i][j] = a[n-j][i];
                a[n-j][i] = a[n-i][n-j];
                a[n-i][n-j] = a[j][n-i];
                a[j][n-i] = t;
            }
        }
    }
    public static void main(String[] args) {
        int [][] a = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(Arrays.deepToString(a));
        rot90(a);
        System.out.println(Arrays.deepToString(a));
        //transpose and reverse works as well//
    }
}
