public class missingNumber {
    public static int getMissingNo(int[] arr,int size){
        int a1 = arr[0];
        int a2 =  1;
        for(int i =1;i<size;i++)
            a1=a1^arr[i];
        for(int i=2;i<=size+1;i++)
            a2=a2^i;
        return (a1^a2);
    }
    public static void main(String[] args)
    {
        int[] a = { 1, 2, 4, 5, 6 };
        int miss = getMissingNo(a, 5);
        System.out.println(miss);
    }
}
