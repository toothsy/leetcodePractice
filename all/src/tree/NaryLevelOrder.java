import java.util.*;

public class NaryLevelOrder {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        List<List<Integer>>  ret = new ArrayList<>();
        while(!q.isEmpty()){
            List<Integer> currLevel = new ArrayList<>();

            for(int i = 0;i<q.size();i++) {
                Node curr = q.poll();
                currLevel.add(curr.val);
                q.addAll(curr.children);
            }
            ret.add(currLevel);
            }


        return ret;
    }

    public static void main(String[] args) {

    }
}
