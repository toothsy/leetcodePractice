import java.util.HashMap;

public class firstRepeatedNumber {
    public static  int firstRepeated(int[] arr,int size){
        int index=-1;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<size;i++){

            if(!hm.containsKey(arr[i]))
                hm.put(arr[i],0 );

            hm.put(arr[i],hm.get(arr[i])+1);

            if(hm.get(arr[i])>1) {
                index = i;break;
            }
        }
        
        return  index;
    }
    public static void main(String[] args)
    {
        int[] arr = { 10, 5, 3, 4, 5,3, 6 };

        int n = arr.length;
        int index = firstRepeated(arr,arr.length);
        if (index != -1) {
            System.out.println("1st Repeating Number is  "
                    + arr[index]);
        }
        else {
            System.out.println("No Repeating Number Found");
        }
    }
}

