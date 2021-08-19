package greedy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class knapSackFrac {
    static class Item {
        int value, weight;
        Item(int x, int y){
            this.value = x;
            this.weight = y;
        }
    }
    static double fractionalKnapsackPQ(int W, Item arr[], int n){
        double profit=0;
        PriorityQueue<Item> maxHeap = new PriorityQueue<>((a,b)->{
            double r1 = (double) a.value/a.weight;
            double r2 = (double) b.value/b.weight;
            return Double.compare(r2,r1);
        });
        maxHeap.addAll(Arrays.asList(arr));
        for(int i =0;i<n;i++){
            Item curr = maxHeap.poll();
            if(W>=curr.weight) {
                profit += curr.value;
                W -= curr.weight;
            }
            else {
                double fin =(arr[i].value/(double) curr.weight);
                profit+= fin*W;
                break;
            }
        }
        return profit;
    }

    static double fractionalKnapsack(int W, Item arr[], int n){
        double profit=0;

        Arrays.sort(arr,(a,b)->{
            double r1 = (double) a.value/a.weight;
            double r2 = (double) b.value/b.weight;
            return Double.compare(r2,r1);
        });



        for(int i =0;i<n;i++){
            if(W>=arr[i].weight) {
                profit += arr[i].value;
                W -= arr[i].weight;
            }
            else {
                double fin =(arr[i].value/(double) arr[i].weight);
                profit+= fin*W;
                break;
            }
        }
        return profit;
    }
    public static void main(String[] args) throws FileNotFoundException {

        File inp = new File("C:\\Users\\Administrator\\Desktop\\intelliJProjects\\all\\src\\greedy\\knapSack.txt");
        Scanner x = new Scanner(inp);


        int N = x.nextInt();
        int W = x.nextInt();
//        int [] val = new int[]{60,100,120,200};
//        int [] weight = new int[]{10,20,30,4};
        Item[] items = new Item[N];
        for (int i = 0; i < N; i++) {
            items[i]= new Item(x.nextInt(),x.nextInt());
        }
//
//        int W = 54;
        long start = System.nanoTime();
        System.out.println(fractionalKnapsack(W,items,N));
        long stop = System.nanoTime();
        System.out.println(stop-start);


        start = System.nanoTime();
        System.out.println(fractionalKnapsackPQ(W,items,N));
        stop = System.nanoTime();
        System.out.println(stop-start);

    }
}
