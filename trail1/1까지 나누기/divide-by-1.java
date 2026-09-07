import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int q = n;
        int result = 0;

        for(int i=1; i<n+1; i++){
            q = q / i;
            result ++;
            if (q <= 1) break;
        }

        System.out.println(result);
    }
}