package greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
class Node {
        int value ;
        Node left,right;
        Node(int val){
            value =val;
            left = right = null;
        }
        static int max=0;
        public static boolean isLeaf(Node t){return t.left ==null&&t.right==null;}

    }
public class huffmanCoding {
    public static Integer makeInteger(String input) {return Integer.parseInt(input);}

    public static ArrayList<Integer> makeWeights(BufferedReader br) throws IOException {
        ArrayList<Integer> weights = new ArrayList<>();
        String st;
        while ((st = br.readLine()) != null)
            weights.add(makeInteger(st));
        return weights;
    }
    public static void printCodes(Node root,String s){
        if(Node.max<s.length()){
            Node.max= s.length();// to get the size of the code with max size;
        }
        if(Node.isLeaf(root)){
            System.out.println(s);
            return;
        }
        printCodes(root.left,s+"0");
        printCodes(root.right,s+"1");
    }
    public static void huffCodes(PriorityQueue<Node> q){

        Node root = null;
        while(q.size()>1){
            // were basically building the tree here
            Node x = q.poll();
            Node y = q.peek();
            q.poll();
            Node res = new Node(-1);
            res.value = x.value+y.value;
            // the step above does the merger of the 2 node's WEIGHT and appends in the queue
            res.left = y;// do understand that huffman code for an input is not unique
            res.right = x;// so you can switch the x,y and still get the same answer
            root = res;
            q.add(res);
        }
        printCodes(root,"");

    }
    public static void main(String[] args) throws IOException {
        File inp = new File("src/greedy/huffman.txt");
        BufferedReader br  = new BufferedReader(new FileReader(inp));
        int numberOfInputs = makeInteger(br.readLine());
        ArrayList<Integer> weights = makeWeights( br);
        PriorityQueue<Node> q = new PriorityQueue<>( Comparator.comparing((o1)->o1.value));
//        PriorityQueue<Node> q = new PriorityQueue<>( (o1,o2)->Integer.compare(o2.value,o1.value));

        /*
         * <h1>here i append all independent nodes inside my priority queue</h1>
         * the reason why we use priority queue as it gives me least element everytime
         */
        for (Integer weight : weights) {q.add(new Node(weight));}//ADDING ALL MY NODES IN QUEUE
        // MIND YOU WE JUST ADDING NOT DOING ANYTHING TO THEM YET.


        huffCodes(q);
        System.out.println("size is "+q.size());
        System.out.println(Node.max+" is the size of longest code");
    }
}