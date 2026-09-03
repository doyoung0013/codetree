import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;

        for (int i=0; i<2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            if (Integer.parseInt(st.nextToken()) >=19 && st.nextToken().charAt(0) == 'M')
                result = 1;
        }
        
        System.out.println(result);
        
    }
}