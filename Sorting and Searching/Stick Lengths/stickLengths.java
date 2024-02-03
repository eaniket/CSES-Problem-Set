import java.util.Arrays;
import java.util.Scanner;

public class stickLengths {
    private static void solve(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long ans = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int x = arr[n/2];
        for(int i=0;i<n;i++){
            ans += Math.abs(x-arr[i]);
        }
        System.out.println(ans);
        return;

    }
    public static void main(String args[]){
        solve();
    }
}
