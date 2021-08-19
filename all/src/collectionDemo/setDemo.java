package collectionDemo;

import java.util.*;

public  class setDemo {
    public static void main(String[] args) {
        Set<Integer> hSet = new HashSet<>();

        hSet.add(5);
        hSet.add(532);
        hSet.add(55);
        hSet.add(57);
        hSet.add(50);
        hSet.add(543);
        System.out.println("set implementation of hashSet\n"+hSet);
        System.out.println("set implementation of hashSet\n"+hSet.hashCode());

        Set<Integer> lSet = new  LinkedHashSet<>();

        lSet.add(5);
        lSet.add(57);
        lSet.add(532);
        lSet.add(55);
        lSet.add(50);
        lSet.add(543);
        System.out.println("set implementation of LinkedHashSet\n"+lSet);
//        System.out.println("set implementation of LinkedHashSet\n"+lSet.hashCode());

        Set<Integer> tSet = new TreeSet<>();

        tSet.add(5);
        tSet.add(57);
        tSet.add(532);
        tSet.add(55);
        tSet.add(50);
        tSet.add(543);
        System.out.println("set implementation of treeSet\n"+tSet);
//        System.out.println("set implementation of treeSet\n"+tSet.hashCode());

        Set<Integer> tSetDes = new TreeSet<>(Comparator.reverseOrder());

        tSetDes.add(5);
        tSetDes.add(57);
        tSetDes.add(532);
        tSetDes.add(55);
        tSetDes.add(50);
        tSetDes.add(543);

        System.out.println("set implementation of descending treeSet\n"+tSetDes);
//        System.out.println("set implementation of descending treeSet\n"+tSetDes.hashCode());


    }
}