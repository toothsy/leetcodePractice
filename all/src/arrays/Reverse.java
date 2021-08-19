
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {


    public static int[] properWay(int[] arr) {
        Integer start = 0, end = arr.length - 1;
        Integer t = 0;
        while (start < end) {
            t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) throws Exception {

        System.out.println(Arrays.toString(properWay(new int[]{2,45,6,6,6,6,4,7,5})));

    }
}
