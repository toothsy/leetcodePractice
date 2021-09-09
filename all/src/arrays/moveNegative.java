import java.util.Arrays;
import java.util.Collections;

public class moveNegative {
    /**
     * <p>move all negative numbers to left side,<br/> order does not matter </p>
     * <h1>[-1,-3,3,-20,-50]</h1> becomes <h1>[-1,-3,-20,-50,3]</h1>
     */




    public static void swap(int[] arr, int s,int e){
        int t = arr[s];
        arr[s] = arr[e];
        arr[e] = t;
    }
    public static int[] mvn(int[] arr){

        int i =0;
        int j =0;
        while(i<arr.length){
            if(arr[i]<0 ) {
                if (j != i)
                    swap(arr, i, j);
                j++;

            }
            i++;
        }
        return arr;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mvn(new int[]{-1, -2, -8, 10,-10, -12, -20})));
    }
}
