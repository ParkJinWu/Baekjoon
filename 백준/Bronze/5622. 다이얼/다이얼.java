import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        String str = br.readLine();
        int time = 0;

        for (int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < str.length() ; j++){
                if(arr[i].contains(Character.toString(str.charAt(j)))){
                    time += i + 3;
                }
            }
        }
        System.out.print(time);

    }
}
