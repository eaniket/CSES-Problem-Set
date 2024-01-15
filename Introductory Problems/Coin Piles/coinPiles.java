import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class coinPiles {
    private static void solve(long a, long b){
        if(a < b){
            a = a^b;
            b = a^b;
            a = a^b;
        }
        if((a+b)%3 == 0 && a<=2*b){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String args[]) throws NumberFormatException, IOException{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int t = Integer.parseInt(bufferedReader.readLine());
        while (t>0){
            String[] input = bufferedReader.readLine().split(" ");
            solve(Long.parseLong(input[0]),Long.parseLong(input[1]));

            t--;
        }
    }
}
