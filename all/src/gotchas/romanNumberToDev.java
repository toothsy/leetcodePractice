package gotchas;

public class romanNumberToDev {
    public static int getNumeric(char a){
        switch(a){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
        }
        return -1;
    }
    static int  rti(String s){
        int num = 0;
        int preVal = 0;
        char []rom = s.toCharArray();
        for(int i = 0;i<s.length();i++){
            int curr = getNumeric(rom[i]);
            num+=curr;
            if(preVal<curr) num-=2*preVal;
            preVal = curr;
        }
        return  num;
    }
    public static void main(String[] args) {
        System.out.println(rti("III"));
    }
}
