public class oddProducts {
    public static int oP(int[] arr){
        int size = arr.length;
        int oddNums = 0;
        for(int i = 0;i<size;i++){
            if(arr[i]%2==1)
                oddNums++;
        }
        return 1+(oddNums-1)*(oddNums*(oddNums+1)/2);
    }
    public static int gfgSol(int[] arr){
        // Initialize the count variable
        int count = 0;
        int N = arr.length;

        // Initialize variable to store the
        // last index with even number
        int last = -1;

        // Initialize variable to store
        // count of continuous odd numbers
        int K = 0;

        // Loop through the array
        for(int i = 0; i < N; i++)
        {

            // Check if the number
            // is even or not
            if (arr[i] % 2 == 0)
            {

                // Calculate count of continuous
                // odd numbers
                K = (i - last - 1);

                // Increase the count of sub-arrays
                // with odd product
                count += (K * (K + 1) / 2);

                // Store the index of last
                // even number
                last = i;
            }
        }

        // N considered as index of
        // even number
        K = (N - last - 1);
        count += (K * (K + 1) / 2);

        return count;
    }
    public static void main(String[] args) {
        System.out.println(oP(new int[]{9,6,15,7,1,7}));
        System.out.println(gfgSol(new int[]{9,6,15,7,8,1,11,13}));

    }
}
