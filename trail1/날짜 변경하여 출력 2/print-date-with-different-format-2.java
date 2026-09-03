import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("-");
        int m = Integer.parseInt(arr[0]);
        int d = Integer.parseInt(arr[1]);
        int y = Integer.parseInt(arr[2]);

        System.out.printf("%d.%d.%d",y,m,d);
    }
}