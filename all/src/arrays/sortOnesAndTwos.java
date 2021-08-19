import  java.util.*;
public class sortOnesAndTwos {
    static void sort012(int a[], int arr_size){
        int low=0,mid=0,high=arr_size-1;
        while(mid<=high){
            switch (a[mid]){
                case 0:{
                      swap(a,low,mid);
                      low++;mid++;break;
                }
                case 1:{
                    mid++;break;
                }
                case 2:{
                    swap(a,high,mid);
                    high--;
                    break;
                }
            }

        }

    }
    public static  void swap(int [] a,int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;

    }
    static void printArray(int arr[], int arr_size){
        int i;
        for (i = 0; i < arr_size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public static void main(String[] args){
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int arr_size = arr.length;
        sort012(arr, arr_size);
        System.out.println("Array after seggregation ");
        printArray(arr, arr_size);
    }
}
