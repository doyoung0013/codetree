import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        boolean satisfied = false;

        for (int i=a; i<b+1; i++){
            if(1920%i==0 && 2880%i==0){
                satisfied = true;
                break;
            }
        }

        if (satisfied) System.out.print(1);
        else System.out.print(0);
    }
}