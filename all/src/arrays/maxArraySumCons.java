public class maxArraySumCons {
    public static void main(String[] args) {
        int[] arr = {3, 2, 7, 10};
        System.out.println(maxSum(arr));
    }


    /**
     * the array elements consectutive to each other must not be added1
     * @param arr input array
     * @return the max sum
     */

    private static int maxSum(int[] arr) {

        int incl = arr[0];
        int excl = 0;
        int exclSave ;
        for(int i =1;i<arr.length;i++){
            exclSave = Math.max(incl, excl);
            incl = excl+arr[i];
            excl = exclSave;

        }
        return Math.max(incl,excl);
    }
}
