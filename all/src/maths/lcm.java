package maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lcm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        String[] inp = br.readLine().trim().split(" ");
        int x = 3;//Integer.parseInt(inp[0]);
        int y = 5;//Integer.parseInt(inp[1]);

        int lcm = Math.max(x,y);
        while (lcm % x != 0 || lcm % y != 0) {
            ++lcm;
        }

        System.out.println(lcm);

    }
}
