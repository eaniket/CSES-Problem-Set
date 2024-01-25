import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class appleDivision {
    static long ans = Integer.MAX_VALUE;
    private static void helper(List<Integer> wt, int n, int idx, long sum1, long sum2){
        if(idx == n){
            ans = Math.min(ans, Math.abs(sum1-sum2));
            return;
        }
        helper(wt, n, idx+1, sum1+wt.get(idx), sum2);
        helper(wt, n, idx+1, sum1, sum2+wt.get(idx));
        return;
    }
    private static void solve(){
        int n;
        List<Integer> wt = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for(int i=0;i<n;i++){
            wt.add(scanner.nextInt());
        }
        helper(wt, n, 0, 0, 0);
        System.out.println(ans);
    }
    public static void main(String args[]){
        solve();
    }
}
