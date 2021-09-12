import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class common3Arrs {
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        // code here
        Set<Integer> ans = new TreeSet<>();
        int min = Math.min(n1,Math.min(n2,n3));
        int len = 0;
        if(n1 == min){
            len = n1;
            for(int i = 0;i<len;i++){
                int ind2  = Arrays.binarySearch(B,A[i]);
                int ind3 = Arrays.binarySearch(C,A[i]);
                if(ind2>=0 && ind3>=0)
                    ans.add(A[i]);

            }
        }
        else if(n2 == min){
            len = n2;
            for(int i = 0;i<len;i++){
                int ind1  = Arrays.binarySearch(A,B[i]);
                int ind3 = Arrays.binarySearch(C,B[i]);
                if(ind1>=0 && ind3>=0)
                    ans.add(B[i]);
            }

        }
        else {
            len = n3;
            for(int i = 0;i<len;i++){
                int ind2  = Arrays.binarySearch(B,C[i]);
                int ind1 = Arrays.binarySearch(A,C[i]);
                if(ind2>=0 && ind1>=0)
                    ans.add(C[i]);

            }

        }
        return new ArrayList<>(ans);

    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 5, 10, 20, 40, 80};
        int[] B = new int[]{6, 7, 20, 80, 100};
        int[] C = new int[]{3, 4, 15, 20, 30, 70, 80, 120};
        System.out.println(commonElements(A,B,C , A.length,B.length,C.length));
    }
}
