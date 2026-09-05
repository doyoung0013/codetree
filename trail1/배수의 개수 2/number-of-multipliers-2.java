import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int i=0; i<10; i++){
            int a = Integer.parseInt(br.readLine());
            if(a%2 == 1) sum++;
        }
        System.out.println(sum);
    }
}