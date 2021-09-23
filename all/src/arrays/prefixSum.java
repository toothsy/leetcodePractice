import java.util.Arrays;

public class prefixSum {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,5,6,67,78,89};
        ps(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void ps(int[] arr) {
        int prev = arr[0];
        for(int i =1 ;i<arr.length;i++){
            arr[i] += prev;
            prev = arr[i];

        }

    }
}
