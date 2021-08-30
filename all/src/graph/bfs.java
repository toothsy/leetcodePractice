import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class bfs {
static class Edges implements Comparator<Edges> {
    /*
    * weight is optional
     */
    Integer weight;
    Integer source;
    Integer destination;

    public Edges(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public int compare(Edges x,Edges y) {
        return x.weight.compareTo(y.weight);
    }

    @Override
    public String toString() {
        String sb = "Edges{" + "weight=" + weight +
                ", source=" + source +
                ", destination=" + destination +
                '}';
        return sb;
    }
}
    List<List<Integer>> adjacencyList = new LinkedList<>();
    /*
    here adjl holds addresses of list of neighbors that each vertex has
     */
    int maxVertices;

    //GRAPH CONSTRUCTOR
    public bfs(List<Edges> edgeList, int maxVertices, boolean bidirectional) {
        this.maxVertices = maxVertices+1;
        // to  maintain proper indexing ive done +1
        for(int i=1;i<=this.maxVertices;i++)adjacencyList.add(new LinkedList<>());//allocating the list at each index of adjl
        for (Edges edge :edgeList) {
            adjacencyList.get(edge.source).add(edge.destination);
            //here the edge.source holds the start index in the adjl and to that adjl i add destination vertex
            if(bidirectional)
                adjacencyList.get(edge.destination).add(edge.source);
        }

    }
    public void printGraph(bfs g){
        int i=1;
        System.out.println("adjacency list is ");

        while(i<this.maxVertices){
            System.out.println("vertex "+i+" :");
            System.out.println("\tis connected to ");
            for (int v : g.adjacencyList.get(i)){
                System.out.print("\t\t"+v);
            }
            System.out.println();
            i++;
        }

    }

    public void Ibfs(int source, int destination){
        System.out.println("\n\n\t\tBFS\n\n");
        boolean[] visited = new boolean[this.maxVertices];
        Integer[] neighbor = new Integer[this.maxVertices];//FOR PRINTING THE NEIGHBORS AFTER WE FIND THE DESTINATION

        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] =true;
        neighbor[source] =-1;
        boolean found=false;
        while(!q.isEmpty()&& !found){
            int QuePop = q.poll();

            for(int i =0 ;i<this.adjacencyList.get(QuePop).size();i++) {
                int neigh = this.adjacencyList.get(QuePop).get(i);
                if (!visited[neigh]) {

                    visited[neigh] = true;

                    System.out.println("neighbor "+" of "+QuePop+" is "+neigh);

                    neighbor[neigh] = QuePop;

                    if(neigh == destination) {
                        System.out.println("\nfound the way\n");
                        found =true;
                        break;

                    }
                    q.add(neigh);
                    System.out.println("q is "+q);
                }
            }
            System.out.println("iteration over");
        }
        if(q.isEmpty()){
            System.out.println("missing vertex");return;
        }
        int i=destination;
        int distance=0;

        while(neighbor[i]!=-1 ){
            System.out.print(i+"==>");
            i =neighbor[i];
            distance++;
        }
        System.out.print(source+"\nand distance is "+distance);

    }
    public void RbfsUtil(bfs g, Queue<Integer> q, boolean[] visited ){
        if(q.isEmpty()) return;
        int current = q.poll();
        System.out.print(current+" ");
        for (int neighbor:g.adjacencyList.get(current)           ) {
            if(!visited[neighbor]){
                visited[neighbor] = true;
                q.add(neighbor);
            }
        }
        RbfsUtil(g,q,visited);

    }
    public void RbfsStarter(bfs g){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[g.maxVertices];

        for (int i =1;i<g.maxVertices;i++){
            if(!visited[i]){
                visited[i] = true;
                q.add(i);
                RbfsUtil(g,q,visited);
            }
        }
    }

    public static List<Edges> firstGraph(){
        List<Edges> edgeList = new LinkedList<>();
        edgeList.add(new Edges(1,2,1));
        edgeList.add(new Edges(1,6,2));
        edgeList.add(new Edges(2,6,5));
        edgeList.add(new Edges(2,5,4));
        edgeList.add(new Edges(3,4,5));
        edgeList.add(new Edges(3,6,2));
        edgeList.add(new Edges(4,5,2));
        edgeList.add(new Edges(5,6,3));
        return edgeList;

    }
    public static List<Edges> secondGraph(){
        List<Edges> edgeList = new LinkedList<>();
        edgeList.add(new Edges(1,2,1));
        edgeList.add(new Edges(1,6,2));
        edgeList.add(new Edges(2,6,5));
        edgeList.add(new Edges(3,4,5));
        edgeList.add(new Edges(3,6,2));
        edgeList.add(new Edges(4,5,2));
        return edgeList;

    }
    public  static  List<Edges> thirdGraph(){
        List<Edges> edgeList = new LinkedList<>();

        edgeList.add(new Edges(1,2,0));
        edgeList.add(new Edges(2,5,0));
        edgeList.add(new Edges(5,4,0));
        edgeList.add(new Edges(4,3,0));
        edgeList.add(new Edges(5,10,0));
        edgeList.add(new Edges(4,7,0));
        edgeList.add(new Edges(7,8,0));
        edgeList.add(new Edges(7,9,0));
        edgeList.add(new Edges(9,6,0));
        edgeList.add(new Edges(6,11,0));
        edgeList.add(new Edges(11,10,0));
        edgeList.add(new Edges(5,6,0));
        edgeList.add(new Edges(12,10,0));
        edgeList.add(new Edges(12,1,0));
        edgeList.add(new Edges(13,2,0));
        edgeList.add(new Edges(13,3,0));
        edgeList.add(new Edges(14,3,0));
        edgeList.add(new Edges(14,8,0));
        edgeList.add(new Edges(15,8,0));
        edgeList.add(new Edges(15,9,0));
        edgeList.add(new Edges(16,9,0));
        edgeList.add(new Edges(16,11,0));
        return edgeList;
    }
    public  static  List<Edges> thirdWeightedGraph(){
        List<Edges> edgeList = new LinkedList<>();

        edgeList.add(new Edges(1,2,3));
        edgeList.add(new Edges(2,5,4));
        edgeList.add(new Edges(5,4,6));
        edgeList.add(new Edges(4,3,3));
        edgeList.add(new Edges(5,10,2));
        edgeList.add(new Edges(4,7,4));
        edgeList.add(new Edges(7,8,2));
        edgeList.add(new Edges(7,9,5));
        edgeList.add(new Edges(9,6,6));
        edgeList.add(new Edges(6,11,3));
        edgeList.add(new Edges(11,10,7));
        edgeList.add(new Edges(5,6,9));
        edgeList.add(new Edges(12,10,2));
        edgeList.add(new Edges(12,1,7));
        edgeList.add(new Edges(13,2,2));
        edgeList.add(new Edges(13,3,7));
        edgeList.add(new Edges(14,3,3));
        edgeList.add(new Edges(14,8,5));
        edgeList.add(new Edges(15,8,2));
        edgeList.add(new Edges(15,9,6));
        edgeList.add(new Edges(16,9,3));
        edgeList.add(new Edges(16,11,5));
        return edgeList;
    }


    public static void main(String[] args) {

        List<bfs.Edges> edgeList = bfs.thirdGraph();
        bfs graph = new bfs(edgeList,16,true);
//        graph.printGraph(graph);
        graph.Ibfs(1,15);

    }
}
