package genericTrees;

import java.util.*;

import static genericTrees.allTrav.trav;
import static genericTrees.levelOrderTrav.lOLineWiseMarker;
import static genericTrees.levelOrderTrav.levelOrder;
import static genericTrees.allTrav.zigZag;

public class construction {
    static class Node{
        int data ;
        ArrayList<Node> children = new ArrayList<>();
    }

    /**
     * <img src="tree.png"/>
     * @param args
     */
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

        assert root != null;
        display(root);
        System.out.println("total number of children / size is "+ size(root));
        System.out.println("max of the tree is "+ max(root));
        System.out.println("height of the tree is "+height(root));
        System.out.println("all traversal of tree ");
        trav(root);
        System.out.println("normal level order");levelOrder(root);
        System.out.println("\nlevel order line-wise");lOLineWiseMarker(root);
        System.out.println("\nzig zag traversal");zigZag(root);

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

    public static void display(Node n){
        StringBuilder s = new StringBuilder(n.data + "->");
        for(Node child:n.children){
            s.append(child.data).append(", ");
        }
        s.append(".");
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


}
