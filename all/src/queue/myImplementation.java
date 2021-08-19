class PriQ {
    /*
    this is a min heap implentation
     */
    int s;
    int[] heap;
    int filled =0;
    PriQ(int size){
        s=size;
        heap = new int[s];
    }

    public void insertInMinHeap(int incomingElement) throws Exception {
        if(this.filled == s-1){
            throw new Exception("heap is full");
        }
        if(this.filled==0) {
            heap[filled] = incomingElement;
            filled++;
            return;
        }
        heap[filled] = incomingElement;
        filled++;
//        System.out.println("before restoring \n"+this);
        restoreMinHeapUp(filled-1);
//        System.out.println("aftert restoring \n"+this);
        }


    public void restoreMinHeapUp(int node){

    if(node==0)
        return;
    int parent = node/2;
    if(heap[parent]>heap[node]) {
//        System.out.println("restoring up");
        swap(parent, node);
    }
    restoreMinHeapUp(parent);
    }


    public  void swap(int i , int j){
//        System.out.println("before swapping \n"+this);
        int t = this.heap[i];
        this.heap[i] = this.heap[j];
        this.heap[j] = t;
//        System.out.println("after swapping \n"+this);

    }
    public void restoreMinHeapDown(int node){
        int lchild = 2*node+1;
        int rchild = 2*node+2;
        if(lchild>=this.filled||rchild>=this.filled || node>=this.s)
            return;
        if(heap[lchild]<heap[node]) {
//            System.out.println("restoring down");
            swap(lchild, node);
        }
        restoreMinHeapDown(lchild);

        if(heap[rchild]<heap[node]) {
//            System.out.println("restoring down");
            swap(rchild, node);
        }
        restoreMinHeapDown(rchild);
    }
    public int remove(){
        System.out.println("before removal\t" + this);
        int first = heap[0];
        heap[0] = heap[--this.filled];
        heap[this.filled] = 0;
        restoreMinHeapDown(0);
        return first;
    }

    @Override
    public  String toString(){
        StringBuilder out = new StringBuilder();
        for(int element :heap) {
            if(element!=0)
            out.append(element).append("\t");
        }
        return out.toString();
    }
    public  void popAll(){
       while(this.filled>0) {
//           System.out.println(this.remove() +"\n");
            this.remove();
//            System.out.println("after removal\t" + this);
        }
    }
}

public class myImplementation {
    public static void main(String[] args) throws Exception {
        PriQ p = new PriQ(7);
        p.insertInMinHeap(63);
        p.insertInMinHeap(46);
        p.insertInMinHeap(53);
        p.insertInMinHeap(32);
        p.insertInMinHeap(26);
        p.insertInMinHeap(10);


        p.remove();
        p.remove();
        p.remove();
        p.insertInMinHeap(26);
        p.popAll();

    }


}
