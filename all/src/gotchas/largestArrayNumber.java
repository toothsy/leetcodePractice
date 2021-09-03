package gotchas;

import java.util.ArrayList;

public class largestArrayNumber {
    public static String larNum(int[] arr){
        ArrayList<String> x = new ArrayList<>();

        for(int e:arr){
            x.add(String.valueOf(e));
        }

        x.sort((a,b)->{
            String ab = a+b;
            String ba = b+a;
            return Integer.compare(Integer.parseInt(ba), Integer.parseInt(ab));
            //switch ba to ab to get ascending order sorting.
        });
        StringBuilder ans = new StringBuilder();
        for(String e :x)
            ans.append(e);


        return ans.toString();

    }
    public static void main(String[] args) {
        System.out.println(larNum(new int[]{22,56,89,12,99,9}));
    }
}
