package collectionDemo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    static{

        System.out.println("this is a test");

    }
    public  static List<Integer> makeList(){
        List<Integer> al = new ArrayList<>();
        al.add(0,14);
        al.add(0,61);
        al.add(0,19);
        al.add(0,31);
        al.add(0,15);
        al.add(0,2621);
        al.add(0,13);
        al.add(0,41);
        al.add(0,641);

        al.remove(0);
        al.add(0,Character.getNumericValue('2'));
        al.remove(0);
        System.out.println("stack type "+al);

        List<Integer> ans = new ArrayList();
        List<List<Integer>> dA = new ArrayList<>();
        int lastAnswer = 0;
        int index=0;
        int last=0;
//        for(int i =0 ;i<n;i++){
//            dA.add(new ArrayList());
//        }
        return al;
//        String s = "ohio";
//        StringBuilder dec = new StringBuilder(s);
//        Character.isDigit()
    }

    public static void main(String[] args) {
        System.out.println(makeList());
    }

}
