

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());



        int b=1;
        for (int i = 0; i <a*2-1; i++) {
            for(int j=0;j<a-Math.abs(i-a+1);j++ ){

                System.out.print("* ");
            }
            System.out.println();
        }




    }
}

