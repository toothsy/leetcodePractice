package recursion;

public class printing {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("calculating while goin up and down the call stack\n");
        printUpAndDown(n);
        System.out.println("calculating while goin going down\n");
        ascPrint(n);
        System.out.println("calculating while going up\n");
        descPrint(n);

    }

    private static void descPrint(int n) {
        if(n== 1){
            System.out.println(1); return ;
        }
        System.out.println(n);
        descPrint(n-1);
    }

    private static void ascPrint(int n) {
        if(n == 1) {
            System.out.println(1);
            return ;
        }
        ascPrint(n-1);
        System.out.println(n);

    }

    private static void printUpAndDown(int n) {
        System.out.println(n);
        if(n == 1) return ;
        printUpAndDown(n-1);
        System.out.println(n);
    }

}
