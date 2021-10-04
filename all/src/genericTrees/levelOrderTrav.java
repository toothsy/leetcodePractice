package genericTrees;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTrav {
    /**
     * its normal version is basically just keep on adding to the queue
     * this makes it only one line, for line wise we have 2 approach
     * @returns nothin
     */
    public static void levelOrder(construction.Node root){
        Queue<construction.Node> mainQueue = new LinkedList<>();
        Queue<construction.Node> childrenQueue = new LinkedList<>();
        mainQueue.offer(root);
        while(!mainQueue.isEmpty() ){
            construction.Node e = mainQueue.poll();
            System.out.print(e.data+" ");
            for(construction.Node child:e.children) {
                childrenQueue.offer(child);
            }
            if(mainQueue.isEmpty()){
                mainQueue = childrenQueue;
                childrenQueue = new LinkedList<>();
                System.out.println();
            }
        }
    }

    public static void lOLineWiseMarker(construction.Node n){
        Queue<construction.Node> q = new LinkedList<>();
        q.offer(n);
        q.offer(null);
        while(!q.isEmpty()){
            n = q.poll();
            if(n != null){
                System.out.print(n.data+" ");
                for(construction.Node child:n.children) q.offer(child);
            }
            else
            if(!q.isEmpty()){
                q.offer(null);
                System.out.println();
            }

        }

    }

//    public static void




}
