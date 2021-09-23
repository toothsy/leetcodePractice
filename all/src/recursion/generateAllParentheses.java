package recursion;

import java.util.ArrayList;
import java.util.List;

public class generateAllParentheses {
    public static void main(String[] args) {
        System.out.println(gen(3));
    }

    private static List<String> gen(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        genPar(ans,0,0,sb,n);
        return ans;
    }

    private static void genPar(List<String> ans, int L, int R, StringBuilder sb, int n) {
        if(sb.length() == 2*n ) {
            ans.add(sb.toString());
            return ;
        }
        if(L<n) {
            sb.append("(");
            genPar(ans, L + 1, R, sb, n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(R<L) {
            sb.append(")");
            genPar(ans, L, R + 1, sb, n);
            sb.deleteCharAt(sb.length()-1);

        }



    }
}
