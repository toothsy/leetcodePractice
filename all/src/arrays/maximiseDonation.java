import java.util.Arrays;

public class maximiseDonation {
    public static void main(String[] args) {
        int[] arr = {2,4,3,2,1};

        System.out.println(solve(arr));;
    }

    public static int solve(int[] arr){
        Arrays.sort(arr);
        int maxDon = arr[0];
        for(int i = 0;i<arr.length;i++){
            maxDon = Math.max(maxDon,arr[i]*(arr.length-i));
        }

        return maxDon;

    }
}

