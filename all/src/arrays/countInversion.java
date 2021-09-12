import java.util.Arrays;

public class countInversion {



    static long inversionCount(long arr[], long N){
        // Your Code Here
        long count = 0;
        long[] dummy = new long[(int)N];
        System.arraycopy(arr,0,dummy,0,(int)N);
        Arrays.sort(dummy);
        for(int i = 0;i<N;i++){
            for(int j = (int)N-1;j>i;j--){
                if(arr[i]>arr[j])count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        long[] arr = new long[]{2, 4, 1, 3, 5};
        System.out.println(inversionCount(arr, arr.length));
    }


}
