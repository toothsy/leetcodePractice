import java.util.Arrays;

public class mergeTwoSortedArrays {
// 0ms solutions were like append in the end and sort
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int[] n1 = new int[]{1,2,3,0,0,0};
        int[] n2 = new int[]{2,5,6};

        mergeArrs(m,n1,n2,n);
        System.out.println(Arrays.toString(n1));

        System.out.println("div is "+ (int)Math.ceil((double)-2*2));
    }

    private static void mergeArrs(int m, int[] n1, int[] n2, int n) {
        int[] mArray = new int[m];
        System.arraycopy(n1, 0, mArray, 0, m);
        int mp1 = 0;
        int p1 = 0;
        int p2 = 0;
        while(mp1<m&&p2<n){
            if(mArray[mp1]<n2[p2]){
                n1[p1] = mArray[mp1] ;
                p1++;mp1++;
            }
            else if(mArray[mp1]>n2[p2]){
                n1[p1] = n2[p2];
                p1++;
                p2++;
            }
            else{
                n1[p1++] = mArray[mp1];
                n1[p1] = mArray[mp1];
                mp1++;
            }
        }
        if(p1<n+m){
            if(mp1<m){
                for(int i = p1;i<m+n;i++){
                    n1[i] = mArray[mp1++];
                }
            }
            if(p2<n){
                for(int i = p1;i<m+n;i++){
                    n1[i] = n2[p2++];
                }
            }
        }

    }
}
