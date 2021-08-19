import java.util.HashMap;
import java.util.Scanner;

public class wheels {
    public static int solve(int [] arr){
        int len = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:arr){
            if(!hm.containsKey(i))
                hm.put(i,1);
            else{
                hm.put(i,hm.get(i)+1);
            }
        }
        int min=Integer.MAX_VALUE,currMin;
        for(int key:hm.keySet()){
            currMin = hm.get(key)/key;
            if(currMin<min)
                min = currMin;
        }

        return min;
    }


    public static void main(String[] args) {
        Scanner x  = new Scanner(System.in);
        int N =27;// x.nextInt();
        int [] arr = new int[]{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 5, 5, 5,};
//        for(int i =0;i<N;i++){
//            arr[i] = x.nextInt();
//        }
        System.out.println(solve(arr));
    }
}
