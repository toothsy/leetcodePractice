import java.util.Arrays;

public class missingAndRepeated {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,5,6};
        System.out.println(Arrays.toString(findMandR(arr,arr.length)));
        System.out.println(1e5);
        int[] ar = new int[(int)1e5];

    }

    private static int[] findMandR(int[] arr, int N) {
        for(int i = 0; i < N; i++)
            arr[i] -= 1;
        Arrays.sort(arr);
        int index = N;
        for(int i = 0 ; i < N ; i++){
            if(arr[i] >= N){
                arr[i] = 0;
                if(index == N){
                    index = i;
                }
            }
        }
        int[] ans = new int[2];
        for(int i = 0; i < index; i++)
            arr[arr[i] % N] += N;
        for(int i = 0; i < N; i++){
            arr[i] = arr[i] / N;
            if(arr[i] == 2)
                ans[0] = i+1;
            if(arr[i] == 0)
                ans[1] = i+1;

        }
        return ans;
    }
}
