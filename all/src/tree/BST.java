import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

 class treeNode{
    int val,level;
    treeNode left;
    treeNode right;
     public treeNode(int v,int l) {
        val = v;
        left = null;
        right = null;
        level = l;
     }

        @Override
        public String toString() {
            return "{" +
                    "v=" + val +
                    ", l=" + left +
                    ", r=" + right +
                    ", level=" + level +
                    "}";
        }
    }
public class BST {
    /*given a sorted array create a tree with minimal height*/

    public static treeNode makeBSTRecursively(Integer[] arr,Integer start,Integer end,int level){
        if(start>end)return  null;
        int mid = (start+end)/2;
        treeNode n = new treeNode(arr[mid],level);
        n.left = makeBSTRecursively(arr,start,mid-1,level+1);
        n.right = makeBSTRecursively(arr,mid+1,end,level+1);
     return n;
    }
    public static treeNode makeBSTRecursively(){
        Integer[] arr = new  Integer[]{56,78,89,97,101,113,160,170,170,190,200,210,220,220};
        return makeBSTRecursively(arr,0,arr.length-1,0);
    }

    public static  void  createLevelLinkedlist(treeNode root,ArrayList<ArrayList<treeNode>> al,int level){
        //here level order might seem obvious but we dont really care how you traverse,
        // we just want linkedlist that have the numbers
        // so approach here is that we traverse in preorder
     if(root==null)return ;
     ArrayList<treeNode> list=null;
     if(level == al.size()){
         list=new ArrayList<>();
         al.add(list);
     }
     else
         list = al.get(level);
     list.add(root);
        createLevelLinkedlist(root.left,al,level+1 );
        createLevelLinkedlist(root.right,al,level+1 );
    }
    public static ArrayList<ArrayList<treeNode>> createLevelLinkedlist(treeNode root){
        ArrayList<ArrayList<treeNode>> al = new ArrayList<>();
        createLevelLinkedlist(root,al,0);
        return  al;
    }
    public static void main(String[] args) {
        treeNode root = makeBSTRecursively();
        System.out.println(root);
        ArrayList<ArrayList<treeNode>> al = createLevelLinkedlist(root);
        System.out.println("array list is ");
        for(ArrayList<treeNode> t : al){
            System.out.println(t);
        }
    }
}