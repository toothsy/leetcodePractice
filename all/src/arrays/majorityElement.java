public class majorityElement {
    public static void main(String[] args) {

        int [] arr= new int[100];
        for(int i =0;i<40;i++)
            arr[i] = 10;
        for(int i = 89;i<100;i++)
            arr[i] = 10;
        System.out.println("majority element is "+ maj(arr,arr.length));
    }

    private static int maj(int[] arr, int size) {

        int max = arr[0];
        int maxCount = 1;
        for(int i = 1;i<size;i++){
            if(arr[i]== max)
                maxCount++;
            else
                maxCount--;
            if(maxCount == 0) {
                max = arr[i];
                maxCount =1;
            }
        }
        if(maxCount>0) {
            int count = 0;
            for (int i = 0;i<size;i++ )
                if(arr[i] == max) count++;

                return count>size/2?max:-1;
        }
        else return -1;
    }
}
