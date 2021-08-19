import java.util.*;

public class dijkstra {
    static  Set<Integer> visited;
    public static Integer[]  dijkstraSolution(int numberOfNodes,int sou, List<List<Node>> adjl,int des ){
        Integer[] dis = new Integer[numberOfNodes+1];
        Arrays.fill(dis,Integer.MAX_VALUE);//make everything infinity
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.cost));//need the vertex with least cost
        pq.add(new Node(0,sou));//adding the source
        visited = new HashSet<>();//so that it holds unique elements only
        dis[sou] =0;//relaxing
        while(!pq.isEmpty()){
            System.out.println(pq);
            Node current = pq.poll();
            if(current.node == des)
                break;
                visited.add(current.node);
            adjNodes(current.node,adjl.get(current.node),visited,dis,pq);// explore the adjacent nodes
        }
        System.out.println(visited);
        return dis;
    }
    public static void adjNodes(int sou,List<Node> adjl,Set<Integer> vis,Integer[] dis,PriorityQueue<Node> pq){
        int edgeDistance;
        int newDistance ;
        for(Node e: adjl){
            if(!vis.contains(e.node)){
                edgeDistance = e.cost;
                newDistance = edgeDistance+dis[sou];//new distance
                if(newDistance<dis[e.node]){//greedy choice
                    dis[e.node] = newDistance;// relax the infinite distance
                }
                pq.add(new Node(dis[e.node],e.node));// adding the unvisited node
            }

        }
    }
    public static void main(String[] args) {
        int numberOFNodes = 6;
        List<List<Node>> adjl = new LinkedList<>();
        for (int i = 0; i < numberOFNodes+1; i++) {
            List<Node> e = new LinkedList<>();
            adjl.add(e);
        }
        addTwice(adjl,1,2,5);
        addTwice(adjl,1,6,5);
        addTwice(adjl,2,6,5);
        addTwice(adjl,2,5,5);
        addTwice(adjl,3,4,5);
        addTwice(adjl,5,4,5);//diff from graph
        addTwice(adjl,6,3,5);
        addTwice(adjl,6,5,5);


        int sou =1;
        int des = 4;
        Integer[]  dis = dijkstraSolution(numberOFNodes,sou,adjl,des );
        System.out.println(Arrays.toString(dis));
        System.out.print(des+"\nand distance is "+dis[des]);
//        System.out.println(visited);
    }
    public  static  void addTwice(List<List<Node>> adjl,int sou,int des,int wei){
        adjl.get(sou).add(new Node(wei,des));
        adjl.get(des).add(new Node(wei,sou));
    }
    }

class Node  {
    Integer cost;
    Integer node;

    public Node(int weight, int n) {
        cost = weight;
        node = n;
    }

    @Override
    public String toString() {

        return "Node{" + "cost=" + cost +
                ", node=" + node +
                '}';
    }
}
