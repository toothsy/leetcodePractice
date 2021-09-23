package recursion;

public class pairingFriends {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(tw(n));
    }

    private static int tw(int n) {
        if(n == 1) return 1;
        if(n == 2) return 3;
        return tw(n-1)+(n-1)*tw(n-2);
    }
}
