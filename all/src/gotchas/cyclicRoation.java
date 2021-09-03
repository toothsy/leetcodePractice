package gotchas;//package arrays;

import java.util.Arrays;
import java.util.Collections;

public class cyclicRoation {
    /**
     *
     * arr
     * @returns rotated array
     * <p>ensure that the array extends objects and not a
     * primitive</p>
     */

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,23,4,5,6,85};
        Collections.rotate(Arrays.asList(arr),5);


        System.out.println(Arrays.toString(arr));
    }
}
