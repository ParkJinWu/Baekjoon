import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        while (true){
            token = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());

            if(a+b == 0) break;

            if(b % a == 0){
                System.out.println("factor");
            }else if (a % b == 0){
                System.out.println("multiple");
            }else {
                System.out.println("neither");
            }
        }
    }
}
