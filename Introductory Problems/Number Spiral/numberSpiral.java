import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class numberSpiral {
    private static void solve(long row, long col){
        long ans;
        // Scanner scanner = new Scanner(System.in);
        // row = scanner.nextLong();
        // col = scanner.nextLong();
        if(row > col){
            ans = (row%2 == 1) ? (row-1)*(row-1) + col : row*row-col+1;
        }else{
            ans = (col%2 == 1) ? col*col - row + 1 : (col-1)*(col-1) + row;
        }
        System.out.println(ans);
        return;
    }

    public static void main(String args[]) throws NumberFormatException, IOException{
        // Scanner scanner = new Scanner(System.in);
        // long testCases = scanner.nextLong();
        // while(testCases-- > 0){
        //     solve();
        // }
        // scanner.close();

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
