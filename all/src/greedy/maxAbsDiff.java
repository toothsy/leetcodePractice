package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class maxAbsDiff {
    /**
     *
     * @param arr
     * @return maximum differnce of abs subarry
     * <h5>Input : { 1, 2, 4, 8 }</h5>
     * <h5>Output : 18</h5>
     * <h5>Explanation : For the given array there are</h5>
     * <h5>several sequence possible</h5>
     * <h5>like : {2, 1, 4, 8}</h5>
     *        <h5>{4, 2, 1, 8} and some more.</h5>
     * <h5>Now, the absolute difference of an array sequence will be</h5>
     * <h5>like for this array sequence {1, 2, 4, 8}, the absolute</h5>
     * <h5>difference sum is</h5>
     * <h5>= |1-2| + |2-4| + |4-8| + |8-1|</h5>
     * <h5>= 14</h5>
     * <h5>For the given array, we get the maximum value for</h5>
     * <h5>the sequence {1, 8, 2, 4}</h5>
     * <h5>= |1-8| + |8-2| + |2-4| + |4-1|</h5>
     * <h5>= 18</h5>
     */
    public static int mad(int[] arr){
        Arrays.sort(arr);
        int size = arr.length-1;
        List<Integer> fin = new ArrayList<>();
        for(int i =0;i<=size/2;i++){
            fin.add(arr[i]);
            fin.add(arr[size-i]);

        }
        if(arr.length%2!=0 )fin.add(size/2);
        int maxDiff = 0;
        for(int i =0 ;i<size-1;i++)
            maxDiff+= Math.abs(fin.get(i)- fin.get(i+1));
        maxDiff+= Math.abs(fin.get(size)- fin.get(0));
        return maxDiff;
    }
    public static void main(String[] args) {
        System.out.println(mad(new int[]{1,4,5,7,8,6,3,2,9,10}));
    }
}
