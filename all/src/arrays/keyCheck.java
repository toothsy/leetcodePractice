class keyCheck {
    static boolean findxInKWindowSize(int N, int[] arr, int key, int stepSize)   {
        int i,j=0;
        for( i= 0;i<N;i+=stepSize){
            for( j=0;j<stepSize;j++){

                if(i+j<N && arr[i+j]==key) {
                    break;
                }
                if(j == stepSize - 1)
                    return false;
            }

        }
        return i+j>=N;

    }

    // Driver Code
    public static void main(String[] args)
    {
        int [] arr = new int[] { 3, 5, 2, 4,  9,  3,
                1, 7, 3, 11, 12, 23 };
        int x = 3, k = 3;
        int n = arr.length;
        if (findxInKWindowSize(n, arr, x, k))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}