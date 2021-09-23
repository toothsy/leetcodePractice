package genericTrees;

import java.util.ArrayList;
import java.util.Stack;

public class construction {
    private static class Node{
        int data ;
        ArrayList<Node> children = new ArrayList<>();


    }
    public static void display(Node n){
        String s = n.data +"->";
        for(Node child:n.children){
            s+=child.data+", ";
        }
        s+=".";
        System.out.println(s);
        for(Node child:n.children){
            display(child);
        }


    }
    public static int size(Node n ){
        int count = 0;
        for(Node child:n.children) {
            int childrenSize = size(child);
            count+=childrenSize;

        }
        return count+1;

    }

    public static  int max(Node n){
        int max=-1;

        for(Node child:n.children)
            max = max(child);

        max = Math.max(max,n.data);
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {1000,20,70,-1,80,-1,90,-1,100,150,-1,-1,-1,30,110,-1,-1,40,120,-1,-1,50,130,-1,-1,60,140,-1,-1,-1};
        Node root = null;
        Stack<Node> st = new Stack<>();
        for (int j : arr) {
            if (j == -1) st.pop();
            else {
                Node t = new Node();
                t.data = j;
                if (st.size() > 0)
                    st.peek().children.add(t);

                else root = t;
                st.push(t);
            }
        }
        display(root);
        System.out.println();
        System.out.println("size is "+ size(root));
        System.out.println();
        System.out.println("max of the tree is "+ max(root));
        System.out.println();
        System.out.println("height of the tree is "+height(root));


    }

    private static int height(Node n) {
        int ht = -1;
        for(Node child:n.children) {
            int h = height(child);
            ht = Math.max(ht,h);

        }
        ht++;
        return ht;
    }
}
