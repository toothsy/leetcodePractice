import java.util.LinkedList;
import java.util.Queue;

public class graph {
    /*
    *i will implement the undirected graph using adjacency list
    *
    */
    private LinkedList<Integer> adjL[];

    private Integer vertices=0;

    public  graph(int v){
        this.vertices =v+1;
        this.adjL = new LinkedList[this.vertices];
        for(int i=1;i<vertices;i++){
            adjL[i] = new LinkedList<>();
        }
    }
    public  void createEdge(int source, int destination,boolean undirected){
        adjL[source].addFirst(destination);
        if(undirected)
        adjL[destination].addFirst(source);
    }

    public  void printGraph(){
        for(int i = 1; i < this.vertices; i++) {
            if(this.adjL[i].size()>0){
                System.out.println("vertex "+i+" connected to :");
                for (int j = 0; j < this.adjL[i].size(); j++) {
                    System.out.print("\t"+this.adjL[i].get(j));
                }
                System.out.println();
            }
            
        }
    }

    public  void  bfs(int sou,int dest){
        //declaration
        boolean[] visited = new boolean[this.vertices];
        Integer[] parent = new Integer[this.vertices];
        Queue<Integer> q = new LinkedList<>();
        //visiting first node
        q.add(sou);
        parent[sou] = -1;//for getting length
        // this is for exploration
        while(!q.isEmpty()){
            int cur = q.poll();

            if(cur == dest) break;
            for(int neighbor: adjL[cur]){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    //marking the node visited
                    q.add(neighbor);
                    parent[cur] = cur;
                }
            }

        }

    }
    public static void main(String[] args) {
        /*
            check the graph.md for the image of graph
*/
        graph g = new graph(6);
        {
        g.createEdge(1, 2,true);
        g.createEdge(1, 6,true);
        g.createEdge(1, 4,true);
        g.createEdge(2, 5,true);
        g.createEdge(2, 6,true);
        g.createEdge(2, 4,true);
        g.createEdge(3, 4,true);
        g.createEdge(3, 6,true);
        g.createEdge(6, 5,true);
        g.createEdge(4, 5,true
        );
        }
        g.printGraph();
    }

}































