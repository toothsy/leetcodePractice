package genericTrees;

import java.util.Stack;
import  genericTrees.construction.Node;


public class allTrav {
    public static void trav(Node root){
        System.out.println("pre trav --- "+root.data);
        for(Node e : root.children) {
            System.out.println("edge "+root.data+" --- "+e.data);
            trav(e);
        }
        System.out.println("post trav --- "+root.data);
    }
    /**
     * <img src="./zigZag.png" />
     * @param node
     */


    public static void zigZag(Node node){
        Stack<Node> mq = new Stack<>();
        Stack<Node> cq = new Stack<>();
        int level = 0;
        mq.push(node);
        while(!mq.isEmpty()){
            node = mq.pop();
            System.out.print(node.data+ " ");
            if((level&1) == 1)
                for(int i = node.children.size()-1;i>=0;i--)
                    cq.push(node.children.get(i));

            else
                for(int i = 0;i<node.children.size();i++)
                    cq.push(node.children.get(i));

            if(mq.isEmpty()){
                mq = cq;
                cq = new Stack<>();
                System.out.println();
                level++;
            }

        }

    }
}
