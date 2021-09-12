public class minJumps {
    /**
     * <p>you'll be given an array every element mentions the jump you need to do</p>
     * <p>input:{1, 4, 3, 2, 6, 7}</p>
     * <p>output:2</p>
     *
     */


    public static int minJs(int[] n){
        if(n.length == 1) return 1;
        int currPos = 0,farthest =0,count = 0;

        for(int i = 0;i<n.length-1;i++){
            farthest = Math.max(farthest,i+n[i]);
            if(farthest >= n.length) return 1+count;
            if(farthest == i) return -1;
            if(i == currPos ) {count++;currPos = farthest;}
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(minJs(new int[]{1,1,2,5}));
    }
}
