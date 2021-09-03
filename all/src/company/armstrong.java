package company;

public class armstrong {


    public static boolean getArmStrong(int n){
        int sum = 0;
        int dummy = n;
        while(dummy!=0){
            int dig = dummy%10;

            sum+= Math.pow(dig,3);

            dummy/=10;
        }

        return sum == n;
    }
    public static void main(String[] args) {
        int num = 154;
        System.out.println(getArmStrong(num));
    }
}
