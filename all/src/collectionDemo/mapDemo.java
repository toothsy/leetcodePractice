package collectionDemo;

import java.util.*;

public class mapDemo {
    public static void main(String[] args) {


        Map<String,Integer> hm = new HashMap<>();
        Map<String,Integer> lhm = new LinkedHashMap<>();
        Map<String,Integer> tm = new TreeMap<>(Comparator.reverseOrder());

        hm.put("B",2);
        hm.put("D",4);
        lhm.put("D",4);
        lhm.put("F",6);
        tm.put("C",3);
        hm.put("C",3);
        tm.put("B",2);
        tm.put("F",6);
        tm.put("A",1);
        lhm.put("A",1);
        lhm.put("C",3);
        hm.put("A",1);
        hm.put("F",6);
        hm.put("E",5);
        tm.put("D",4);
        lhm.put("E",5);
        lhm.put("B",2);
        tm.put("E",5);


        System.out.println(hm);
        System.out.println(lhm);
        System.out.println(tm);
        linkedHashMapTest();
        collisionCheck();
    }

    public static void linkedHashMapTest(){
        Map<Integer,Integer> hm = new LinkedHashMap<>();


        hm.put(1,1);
        hm.put(1,2);
        for(Integer e : hm.keySet()){
            System.out.println(hm.get(e));
        }

    }
    public static void collisionCheck(){
        Map<String,Integer> hm = new HashMap<>();
        //default size at 16,fill ratio at 0.75
        hm.put("one",1);
        hm.put("two",2);
        hm.put("three",3);
        hm.put("four",4);
        System.out.println(hm.containsKey("1"));//false
        System.out.println(hm.containsValue(1));//true
        System.out.println(hm.get("one"));
        hm.remove("one");
        hm.getOrDefault("zero",0);
        hm.put("zero",10);
        hm.getOrDefault("zero",10);
        hm.put("zero",0);

    }
}
