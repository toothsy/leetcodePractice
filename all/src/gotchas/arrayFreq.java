package gotchas;

import java.util.Arrays;

public class arrayFreq {
    public static void main(String[] args) {
        int[] arr = {1,5,2,2,4,4,11,12,6};
        int P = 12;
        findFreq(arr,arr.length,P);
        System.out.println(Arrays.toString(arr));
    }

    private static void findFreq(int[] arr, int N, int P) {
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
        for(int i = 0; i < index; i++)
            arr[arr[i] % N] += N;
        for(int i = 0; i < N; i++)
            arr[i] = arr[i] / N;


    }
}
