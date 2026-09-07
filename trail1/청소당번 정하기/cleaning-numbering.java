import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int classClean = 0;
        int hallwayClean = 0;
        int toiletClean = 0;
        for(int i=1; i<n+1; i++){
            if (i % 12 == 0){
                toiletClean ++;
            } else if (i % 3 == 0){
                hallwayClean++;
            } else if (i % 2 == 0){
                classClean++;
            }
        }

        System.out.printf("%d %d %d", classClean, hallwayClean, toiletClean);
    }
}