import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i=1; i<n; i++){
            if(n%i == 0) sum += i;
        }

        if(sum == n) System.out.println('P');
        else System.out.println('N');
    }
}