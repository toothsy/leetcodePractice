import java.util.Arrays;

public class merge2SortedArrs {
    /**
     * <p>given two sorted arrays, merge them without extra space</p>
     * @param arr1  first sorted array
     * @param n its length
     * @param arr2 second sorted array
     * @param m its sorted length
     */


    private static void m2sa(int[] arr1, int n, int[] arr2, int m) {
        int i=n-1,j=0;
        while(i>=0&&j<m){
            if(arr1[i]>arr2[j])
                swap(arr1,arr2,i,j);
            i--;j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    private static void swap(int[] arr1,int[] arr2,int i,int j){
        int t = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = t;
    }
    public static void main(String[] args) {
        int[] a = new int[]{1,3,5,7};
        int[] b = new int[]{0,2,6,8,9};
        m2sa(a,a.length,b,b.length);
        System.out.print(Arrays.toString(a));
        System.out.print(Arrays.toString(b));

    }
}
