import java.util.ArrayList;

public class subSeqBF {


    static void printfSubSeq(String s,int index,String output){


        if(index==s.length()){
             System.out.println(output);
            return;
        }
        printfSubSeq(s,index+1,output);
        output+=s.charAt(index);

        printfSubSeq(s,index+1,output);



    }
    public static void main(String[] args) {

        String s = "abc";
        String o ="";
        printfSubSeq(s,0,o);

        System.out.println("the output is "+o);
    }
}
