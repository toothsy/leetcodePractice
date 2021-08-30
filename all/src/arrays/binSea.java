public class binSea {
    public static int bs(int[] arr, int key){
        int left = 0; int right = arr.length;
        while(left<right){
            int mid = left + (right-left)/2;
            if(arr[mid]== key ) {
                return mid;
            }
            else if(arr[mid]>key){
                right = mid;
            }
            else left = mid+1;

        }
        return arr[left] != key ? -1: left;
    }
    public static int sqrt(int num){
        int left = 1;
        int right = num;
        while(left<=right){
            int mid = left + (right- left)/2;
            if(mid*mid == num) return mid;
            else if(mid*mid>num) right = mid-1;
            else left = mid+1;

        }
        return left;

    }

    public static void main(String[] args) {
//        System.out.println(bs(new int[]{1,2,3,5,6,7,9},4));

//        System.out.println(sqrt(24));
        boolean [] firstTrue = new boolean[100];
        for(int i =0;i<90;i++){
            firstTrue[i] = true;
        }
        System.out.println("last true at "+lastOccurrenceOfTrue(firstTrue));


        boolean [] firstFalse = new boolean[100];
        for(int i = 69;i<firstFalse.length;i++){
            firstFalse[i] = true;
        }
        System.out.println("first true at "+firstOccurrenceOfTrue(firstFalse));
    }
    public static int firstOccurrenceOfTrue(boolean [] arr){
        int left = 0; int right  = arr.length-1;
        int ans  = -1;

        while(left<= right ){
            int mid = left + (right-left-1)/2;
            if(arr[mid]){
                ans = mid;
                right = mid-1;
            }
            else if(arr[left]) right = mid-1;
            else left = mid + 1;
        }

        return  ans;
    }
    public static int lastOccurrenceOfTrue(boolean [] arr) {
        int left = 0;int right = arr.length-1;
        int ans  = -1;
        int interations = 0;
        while(left<right){
            interations++;
            int mid = left + (right-left-1)/2;
            if(!arr[mid]) {
                ans = mid;
                right = mid -1;
            }
            else if(arr[left])left = mid+1;
            else  right = mid-1;
        }

        return ans;
    }

}
