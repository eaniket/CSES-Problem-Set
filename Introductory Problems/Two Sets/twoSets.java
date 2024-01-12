import java.util.Scanner;

public class twoSets {
    private static void solve(){
        long n, sum = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        sum = n*(n+1)/2;
        if(sum%2 == 1){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        StringBuilder result = new StringBuilder();
        if(n%2 == 1){
            result.append(n/2).append("\n");
            for(int i=2;i<=n/2;i = i+2){
                result.append(i).append(" ").append(n-i).append(" ");
            }
            result.append(n).append("\n").append((n+1)/2).append("\n");
            for(int i=1;i<=n/2;i = i+2){
                result.append(i).append(" ").append(n-i).append(" ");
            }
        }else{
            result.append(n/2).append("\n");
            for(int i=2;i<=n/2;i = i+2){
                result.append(i).append(" ").append(n-i+1).append(" ");
            }
            result.append("\n").append(n/2).append("\n");
            for(int i=1;i<=n/2;i = i+2){
                result.append(i).append(" ").append(n-i+1).append(" ");
            }
        }
        System.out.print(result);
        scanner.close();
        return;
    }
    public static void main(String args[]){
        solve();
    }
}
