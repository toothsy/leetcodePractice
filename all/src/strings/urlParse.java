import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class urlParse {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String url = br.readLine();
        int q = Integer.parseInt(br.readLine());
        for(int i = 0;i<q;i++){
            String t = br.readLine();
            if(!url.contains(t)) {

                System.out.println("-1");
            }
            else{
                if((url.indexOf(t)-1)>0&& url.charAt(url.indexOf(t)-1)=='=') System.out.println("-1");
                else{
                    int index = url.indexOf(t) + t.length();
                    System.out.println("\n index is " + index);
                    index++;
                    StringBuilder sb = new StringBuilder();
                    while (index < url.length() && url.charAt(index) != '&') {
                        sb.append(url.charAt(index));
                        index++;
                    }
                    System.out.println(sb);
                }
            }
        }
    }
}
