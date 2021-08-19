package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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




    }
}
