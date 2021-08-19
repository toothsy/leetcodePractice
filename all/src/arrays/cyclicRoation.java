//package arrays;

public class cyclicRoation {
    public  static  void printArray(int [] arr){
        for (int j : arr) {
            System.out.print(j + "\t");
        }
        System.out.println("");
    }
    public static int[]  cyclicShift(int[ ] arr ){
        int last = arr[arr.length-1];


        for(int i = arr.length-1;i>0;i--)
            arr[i] = arr[i-1];

        arr[0] =last;
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5};
        printArray(cyclicShift(arr));
    }
}
