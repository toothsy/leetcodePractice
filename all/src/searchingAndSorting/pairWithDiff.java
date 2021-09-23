package searchingAndSorting;

import java.util.Arrays;

public class pairWithDiff {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,1,1,2,2,34,3,33,12,2,1,232,3,334,4444,4,44,4,33};
        int diff = 30;
        System.out.println(fp(arr,diff));
    }

    private static boolean fp(int[] arr, int diff) {
        Arrays.sort(arr);
        int res = -1;

        for(int i =0;i<arr.length;i++){
            res = Arrays.binarySearch(arr, diff+arr[i]);
            if(res>=0) break;
        }

        return res>=0;
    }
}

