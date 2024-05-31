import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(token.nextToken());
        int k = Integer.parseInt(token.nextToken());

        Integer score[] = new Integer[N];

        token = new StringTokenizer(br.readLine()," ");

        for(int i = 0 ; i < N; i++){
            score[i] = Integer.parseInt(token.nextToken());
        }

        Arrays.sort(score, Comparator.reverseOrder());

        System.out.println(score[k-1]);


    }
}
