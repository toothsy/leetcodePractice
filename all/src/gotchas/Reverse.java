package gotchas;

import java.util.*;
import java.util.Stack;

public class Reverse {


    public static Integer[] properWay(Integer[] arr) {
        int start = 0, end = arr.length - 1;
        int t ;
        while (start < end) {
            t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));

        return arr;
    }

    public static void main(String[] args) throws Exception {

        System.out.println(Arrays.toString(properWay(new Integer[]{2,45,6,6,6,6,4,7,5})));

    }
}
