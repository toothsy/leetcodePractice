package recursion;

public class countBinaryStrings {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(countBinS(n));
    }

    /**
     *
     * @param n number of bits  available1
     * @return total number of bits where the 1's are not consecutive
     *
     *
     *
     * <p> logic is same as fibonacci series except it starts from 1</p>
     *
     */

    private static int countBinS(int n) {
        if(n == 1)return 2;
        if(n == 2) return 3;
        return countBinS(n-1)+countBinS(n-2);
    }
}
