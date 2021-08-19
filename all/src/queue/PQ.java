import java.util.*;

public class PQ {

    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((Comparator.reverseOrder()));
        pq.add(12);
        pq.add(120);
        pq.add(102);
        pq.add(2);
        pq.add(1);
//        PriorityQueue<String> pq = new PriorityQueue<>(((o1, o2) -> {return -o1.compareTo(o2);}));
//        PriorityQueue<String> pq = new PriorityQueue<>();
//        pq.add("D");
//        pq.add("E");
//        pq.add("B");
//        pq.add("A");
//        pq.add("C");
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }
}
