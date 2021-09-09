import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class unionArr {
    /**
     * <p>given two arr return an array that contains unique element from both the arrays</p>
     */



    public static int[] uni(int[]a,int[]b){
        int  n = a.length;
        int m = b.length;
        Set<Integer> s = new HashSet<>();
        for(int i = 0;i<n;i++)s.add(a[i]);
        for(int i = 0;i<m;i++)s.add(b[i]);
        int[] ans = new int[s.size()];
        Iterator<Integer> it = s.iterator();
        int i =0;
        while(it.hasNext()) {
            ans[i] = it.next();
            i++;
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,5,67};
        int[] b = new int[]{3,4,5,6,7,8,9,9,10};
        System.out.println(Arrays.toString(uni(a,b)));
    }
}
