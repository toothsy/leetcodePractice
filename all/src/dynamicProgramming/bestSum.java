import java.util.ArrayList;

public class bestSum {
    public static ArrayList<Integer> bs(int target, int[] numbers) {

        if(target==0 )
            return new ArrayList<>();
        if(target<0)
            return null;
        ArrayList<Integer> combination = new ArrayList<>();
        for(int i =0;i<numbers.length;i++){
            int rem = target-numbers[i];
        }
        return combination;
    }


    public static void main(String[] args) {
        System.out.println(bs(6, new int[]{3, 4,2, 5,7}));
    }
}
