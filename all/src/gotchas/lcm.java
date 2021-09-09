package gotchas;

public class lcm {
    public static void main(String[] args) {
        int a = 4, b = 5,lcm ;
        lcm = Math.max(a,b);
        while(true){
            if(lcm%a==0&&lcm%b==0)break;
            lcm++;
        }

        System.out.println("lcm is "+lcm);


    }
}
