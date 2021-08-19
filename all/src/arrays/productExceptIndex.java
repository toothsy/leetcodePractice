public class productExceptIndex {
    public static void printExcept(int[] arr){
        int [] reverseProductTillIndex = new int[arr.length];
        int product =1;
        printArray(arr);
        for(int i =0;i<arr.length;i++){
            reverseProductTillIndex[i]=product;
            product*=arr[i];

        }
        printArray(reverseProductTillIndex);
//        product =1;
//        int[] afterIndex = new int[arr.length];
//        for(int i = arr.length-1; i>=0; i--){
//            afterIndex[i] = product;
//            product *= arr[i];
//        }
//        printArray(afterIndex);
        product =1;
        for(int i = arr.length-1;i>=0;i--){
            reverseProductTillIndex[i] *= product;
            product *= arr[i];
        }
        printArray(reverseProductTillIndex);
    }
    public  static  void printArray(int [] arr){
        for (int j : arr) {
            System.out.print(j + "\t");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int [] arr =  {10,2,6,3,4};
        printExcept(arr);
    }
}
