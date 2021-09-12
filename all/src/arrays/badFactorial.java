import java.util.ArrayList;

public class badFactorial {
    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        for(int i = 2;i <= N;i++){
            int carry = 0;
            for(int j = al.size()-1;j >= 0;j--){
                int temp = carry;
                carry = ((al.get(j)*i)+carry)/10;
                al.add(j,((al.remove(j)*i)+temp)%10);
            }
            while(carry != 0){
                al.add(0,carry%10);
                carry = carry/10;
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int N = 20;
        for(int e : factorial(N)) {
            System.out.println(e);
        }
        System.out.println();
    }

}
