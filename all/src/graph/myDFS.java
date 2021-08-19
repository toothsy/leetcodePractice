import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
class myDFS{
     static int vert;
     static List<List<Integer>> adjl = new LinkedList<>();

     public static void Idfs(int source ,int destination){
          Stack<Integer> st = new Stack<>();
          Integer[] path = new Integer[vert];
          st.push(source);
          path[source] = -1;
          boolean[] visited = new boolean[vert];

          int i =0;
          while(!st.isEmpty()){

               int currentNode = st.pop();
               if(currentNode == destination){
                    System.out.println("yay found the way");
                    break;
               }
               if(!visited[currentNode]){
                    System.out.println("visited node "+ currentNode);
                    visited[currentNode] = true;
               }

               Iterator<Integer> iter = adjl.get(currentNode).iterator();
               while(iter.hasNext()){
                int v = iter.next();
                if(!visited[v]) {
                     st.push(v);
                     path[currentNode] = v;
                }
               }
          }
          i = source;
          while(path[i]!=null) {
               System.out.print(i+"\t");
               i = path[i];
          }
     }
     public static  void RdfsStarter(int sou,int dest,int maxVertex){
          boolean[] visited = new boolean[maxVertex];
          boolean flag = false;
          Integer[] path = new Integer[vert];
          dfs(sou,dest,visited,path);
          int i;
          i = sou;
          while(path[i]!=null) {
               System.out.print(i+"\t");
               i = path[i];
          }
     }

     private static void dfs(int sou,int dest, boolean[] visited,Integer[] path) {
          if(sou==dest) {
               System.out.println("yay found the way");
               return;
          }
          visited[sou]=true;
          System.out.println("visited "+sou);
          for(int i =0 ;i< adjl.get(sou).size();i++) {
               int neigh = adjl.get(sou).get(i);
               if (!visited[neigh]) {
                    path[sou] = neigh;
                    dfs(neigh, dest, visited, path);
               }
          }
     }
     public static void main(String[] args) {

          List<bfs.Edges> edgeList = bfs.thirdGraph();
          boolean bi = true;
          vert = 16+1;//max vertex according to the graph

          for(int i=0;i<vert;i++)
               adjl.add(new LinkedList<Integer>());

          for (bfs.Edges edge:edgeList){
               adjl.get(edge.source).add(edge.destination);
               if(bi)
                    adjl.get(edge.destination).add(edge.source);
          }

//          bfs graph = new bfs(edgeList,16,true);
          Idfs(1,5);
          System.out.println("\n--------------------------------------------------------------------------------");
          System.out.println("recursive dfs");
          RdfsStarter(1,15,vert);

     }

     public  static  List<bfs.Edges> thirdGraph(){
          List<bfs.Edges> edgeList = new LinkedList<>();

          edgeList.add(new bfs.Edges(1,2,0));
          edgeList.add(new bfs.Edges(2,5,0));
          edgeList.add(new bfs.Edges(5,4,0));
          edgeList.add(new bfs.Edges(4,3,0));
          edgeList.add(new bfs.Edges(5,10,0));
          edgeList.add(new bfs.Edges(4,7,0));
          edgeList.add(new bfs.Edges(7,8,0));
          edgeList.add(new bfs.Edges(7,9,0));
          edgeList.add(new bfs.Edges(9,6,0));
          edgeList.add(new bfs.Edges(6,11,0));
          edgeList.add(new bfs.Edges(11,10,0));
          edgeList.add(new bfs.Edges(5,6,0));
          edgeList.add(new bfs.Edges(12,10,0));
          edgeList.add(new bfs.Edges(12,1,0));
          edgeList.add(new bfs.Edges(13,2,0));
          edgeList.add(new bfs.Edges(13,3,0));
          edgeList.add(new bfs.Edges(14,3,0));
          edgeList.add(new bfs.Edges(14,8,0));
          edgeList.add(new bfs.Edges(15,8,0));
          edgeList.add(new bfs.Edges(15,9,0));
          edgeList.add(new bfs.Edges(16,9,0));
          edgeList.add(new bfs.Edges(16,11,0));
          return edgeList;
     }
}
