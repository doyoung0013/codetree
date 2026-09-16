import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        boolean isExist = false;

        for (int i = a; i < b + 1; i++) {
            if (i % c == 0) {
                isExist = true;
                break;
            }
        }

        if (isExist) System.out.println("NO");
        else System.out.println("YES");
    }
}
