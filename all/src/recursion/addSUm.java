package recursion;

import java.util.Arrays;

public class addSUm {

    static int  as(int [] inp, int index){
        if(index ==0){return inp[index];}
        if(index>=1){
            inp[index] +=  as(inp,index-1);
        }
        return inp[index];

    }
    public static void main(String[] args) {
        int []x = new int[]{1,2,3,4,5,6};
        as(x,5);
        System.out.println(Arrays.toString(x));
    }
}
