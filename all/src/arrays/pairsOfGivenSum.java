import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class pairsOfGivenSum {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[]{48,24,99,51,33,39,29,83,74,72,22,46,40,51,67,37,78,76,26,28,76,25,10,65,64,
                47,34,88,26,49,86,73,73,36,75,5,26,4,39,99,27,12,97,67,63,15,3,92,90};
        int sum = 50;
        System.out.println(pogs(arr,arr.length,sum));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
    }

    private static int pogs(int[] arr,int n, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count=0;
        for(int i:arr ){
            if(i>k) continue;
            if(hm.containsKey(k-i))
                count+=hm.get(k-i);
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        return count;


    }
}
