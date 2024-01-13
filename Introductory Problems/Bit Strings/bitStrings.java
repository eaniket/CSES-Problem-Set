import java.util.Scanner;

public class bitStrings {
    private static void solve(){
        long n, ans = 1, mod = 1000000007;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for(int i=0;i<n;i++){
            ans = (ans*2)%mod;
        }
        System.out.print(ans);
        scanner.close();
        return;
    }
    public static void main(String args[]){
        solve();
    }
}

