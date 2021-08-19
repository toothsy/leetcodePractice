import java.io.File;
import java.util.*;
public class CycleDetectionUsingtopoLogical {

    public static void main(String[] args) throws Exception {
        File f = new File("C:\\Users\\Administrator\\Desktop\\intelliJProjects\\all\\src\\graph\\topoInput.txt");

        Scanner x = new Scanner(f);
        int V = x.nextInt();
        int E = x.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i =0;i<E;i++){
            adj.get(x.nextInt()).add(x.nextInt());
        System.out.println("cyclic?\n"+isCyclic(V,adj));
        }
    }
    public static boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj)
    {
        Queue<Integer> q = new LinkedList<>();
        Integer[] inDegree = new Integer[V];// this will hold our degree a given node
        Arrays.fill(inDegree,0);//current
        for(int i =0;i<V;i++){
            for(int neigh: adj.get(i)){
                inDegree[neigh]++;//increase indegree  by one for every vertex that  has connection to ith vertex
            }
        }
        for(int i =0;i<V;i++){
            if(inDegree[i]==0)
                q.add(i);// add vertex that have 0 dependencies to queue
        }
        int count =0;
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int neigh : adj.get(curr))
                if(--inDegree[neigh]==0)//relax the curr vertex by decreasing the count of inDegree
                    q.add(neigh);// add the ones having 0 indegree to the queue for further processing
            count++;

        }
        return count<V;
    }
}
