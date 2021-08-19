package collectionDemo;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Stack;

public class arrayDequeDemo {
    public static  ArrayDeque<Integer> makeDeque(){

        ArrayDeque<Integer> al = new ArrayDeque<>();

        al.offerFirst(2);
        al.offerFirst(32);
        al.offerFirst(3);
        al.offerFirst(982);
        al.offerFirst(32);
        return al;
    }
    public static void main(String[] args) {

        ArrayDeque<Integer> al = new ArrayDeque<>();

        al.offerFirst(2);
        al.offerFirst(32);
        al.offerFirst(3);
        al.offerFirst(982);
        al.offerFirst(32);
        System.out.println(al);
        al.offerLast(337);
        System.out.println(al);

        al.offerFirst(742);
        System.out.println(al);
        al.offerLast(361);
        System.out.println(al);
        System.out.println(al.peekFirst());
        System.out.println("this is peekLast "+al.peekLast());
        al.removeLast();

        System.out.println("this is peekLast "+al.peekLast());
        System.out.println(al);
        al.removeFirst();
        System.out.println("this is peekFirst "+al.peekFirst());
        System.out.println(al);

    }
}
