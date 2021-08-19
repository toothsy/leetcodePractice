public class magicIndex {
    /*if i is arr[i] reutrn the first matching i,where arr is a sorted array*/
    public static int isMagicIndexBruteForce(int[] arr){
        boolean flag = true;
        int i=-1;
        for(i =0;i< arr.length;i++){
            if(i==arr[i]) {
                break;
            }
        }
        return i;
    }
    private static int isMagicIndexBinarySearch(int[] arr,int low,int high) {
        if(high<low) return -1;
        int mid = (low+high)/2;
        if(arr[mid]==mid)
            return mid;
        if(arr[mid]>mid)
            return isMagicIndexBinarySearch(arr,low,mid-1);
        else
            return  isMagicIndexBinarySearch(arr,mid+1,high);
    }
    private static int isMagicIndexBinarySearchDuplicates(int[] array,int start,int end) {
        if (end< start) return -1;
        int midindex =(start+ end)/ 2;
        int midValue = array[midindex];
        if (midValue == midindex) {
            return midindex;
        }

        /* Search left */
        int leftindex = Math.min(midindex - 1, midValue);
        int left = isMagicIndexBinarySearchDuplicates(array, start, leftindex);
        if (left>= 0) {
            return left;
        }

        /* Search right */
        int rightindex = Math.max(midindex + 1, midValue);

        return isMagicIndexBinarySearchDuplicates(array, rightindex, end);

    }
    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,4,4,6};
        long start = System.nanoTime();
        System.out.println(isMagicIndexBruteForce(a));
        long stop = System.nanoTime();
        System.out.println(stop-start);

//fails for duplicates
        start = System.nanoTime();
        System.out.println(isMagicIndexBinarySearch(a,0,a.length-1));
        stop = System.nanoTime();
        System.out.println(stop-start);

        start = System.nanoTime();
        System.out.println(isMagicIndexBinarySearchDuplicates(a,0,a.length-1));
        stop = System.nanoTime();
        System.out.println(stop-start);
    }

}
