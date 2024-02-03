import java.util.Arrays;
import java.util.Scanner;

public class missingCoinSum {
    private static void solve(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n && arr[i] <= sum+1; i++){
            sum += arr[i];
        }
        System.out.println(sum+1);
    }
    public static void main(String args[]){
        solve();
    }
}
