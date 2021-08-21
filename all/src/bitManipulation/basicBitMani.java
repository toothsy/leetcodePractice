package bitManipulation;

public class basicBitMani {
    static int findBit(int i ,int pos){return i&(1<<pos);}
    static  int setBit(int i, int pos){return i|(1<<pos);}
    static int clearBit(int i, int pos){return i&~(1<<pos);}
    static int numberOfSetBits(int i){int counter=0;while(i!=0){i = i&(i-1);counter++;}return counter;}
    static int getDeciDigits(int i ){return (int)(Math.log10(i)+1);}
    public static void main(String[] args) {
        System.out.println(findBit(5,2));
        System.out.println(setBit(5,1));
        System.out.println(setBit(5,3));
        System.out.println(clearBit(5,2));
        System.out.println("total number of set bits are " + numberOfSetBits(7));
        System.out.println("decimal digits are "+getDeciDigits(2000));

    }
}
