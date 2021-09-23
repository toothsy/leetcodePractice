package collectionDemo;

import java.util.*;

public class collectionDemo {
    public static void main(String[] args) {
        List<Integer> al = ListDemo.makeList();


            System.out.println("normal "+al);

        Collections.sort(al);

            System.out.println("sorted "+al);

        System.out.println("binary search res is "+Collections.binarySearch(al,6561));

        Collections.reverse(al);

            System.out.println("reversed "+al);

            List<Integer> copy = new ArrayList<>();
            Collections.addAll(copy,1,1,1,1,1,1,1,11,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1);
            for (int i = 0;i<10;i++)
                    copy.add(i);
        Collections.copy(copy,al);
            System.out.println("copy is "+copy);
        Integer[] arr = new Integer[]{1,2,3,4,5,6,7};
        Collections.rotate(Arrays.asList(arr),2);
        System.out.println(Arrays.toString(arr));


    }
}
