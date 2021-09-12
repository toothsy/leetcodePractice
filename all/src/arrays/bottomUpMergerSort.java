import java.util.Arrays;

public class bottomUpMergerSort {
    static int[] aux;
    public static void merge(int[] arr,int low,int mid,int high){
        int i = low;
        int j = mid+1;
        for(int k = low;k<=high;k++) aux[k] = arr[k];

        for(int k = low;k<=high;k++){
            if(i>mid) aux[k] = arr[j++];
            else if(j>high) aux[k] = arr[i++];
            else if(arr[j]<arr[i]) aux[k]= arr[j++];
            else aux[k] = arr[i++];
        }


    }
    public static void bums(int[] arr){
        int N = arr.length;
        aux = new int[arr.length];

        for(int i = 1;i<N;i+=i){
            for(int j = 0;j<N-i;j+=i+i){
                merge(arr,j,i+j-1,Math.min(i+j+i-1,N-1));
            }
        }

    }
    public static void main(String[] args) {
         int[] arr = new int[]{4,5,7,5,12,2,2,4,7,5,6,6,6,12,87,2};
        bums(arr);
        System.out.println(Arrays.toString(aux));;
    }
}
