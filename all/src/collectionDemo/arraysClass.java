package collectionDemo;

import java.util.Arrays;
import java.util.Collections;

public class arraysClass {
    public static void main(String[] args) {
        Integer[] test = new Integer[]{71,270,053,04,750,6,77,8,8,9,99, 15,0xF,031};


        System.out.println("copy of :\n"+ Arrays.toString(Arrays.copyOf(test, 10)));

        System.out.println("copy in range: \n"+ Arrays.toString(Arrays.copyOfRange(test, 1, 11)));

        System.out.println("deepEquals:\n"+Arrays.deepEquals(test,Arrays.copyOf(test,test.length-1)));
        System.out.println("equals:\n"+Arrays.equals(test,Arrays.copyOf(test,test.length)));


        Arrays.sort(test,9,14);
        System.out.println("sorted from 9 to 14\n"+Arrays.toString(test));


        Arrays.sort(test,9,14, ((o1, o2) -> Integer.compare(o2,o1)));
        System.out.println("sorted descending from 9 to 14\n"+Arrays.toString(test));

        Arrays.sort(test);
        System.out.println("sorted\n"+Arrays.toString(test));

        System.out.println("binarySearch \n"+Arrays.binarySearch(test,4,8,6));
        Arrays.fill(test,-1);
        System.out.println("filled -1\n"+Arrays.toString(test));
    }
}
