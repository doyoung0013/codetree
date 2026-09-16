import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=n; i>0; i--){
            for(int k=0; k<n-i; k++){
                System.out.print("  ");
            }
            for(int j=0; j<2*i-1; j++){
                System.out.print("* ");
            }
            for(int k=0; k<n-i; k++){
                System.out.print("  ");
            }
            System.out.println();
        }

        for(int i=2; i<=n; i++){
            for(int k=0; k<n-i; k++){
                System.out.print("  ");
            }
            for(int j=0; j<2*i-1; j++){
                System.out.print("* ");
            }
            for(int k=0; k<n-i; k++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}