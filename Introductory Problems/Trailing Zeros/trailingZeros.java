import java.util.Scanner;

public class trailingZeros {
    private static void solve(){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt(), ans = 0, deno = 5;
        while(n >= deno){
            ans = ans + (n/deno);
            deno = deno*5;
        }
        System.out.println(ans);
        scanner.close();
        return;
    }
    
    public static void main(String args[]){
        solve();
    }
}
