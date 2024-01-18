import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class grayCodes {
    private static void solve(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n == 0){
            System.out.println("0");
            return;
        }

        List<String> ans = new ArrayList<>();
        String s0 = "0";
        String s1 = "1";

        ans.add(s0);
        ans.add(s1);

        for(int i=2;i<=n;i++){
            int siz = ans.size();
            for(int j = siz-1; j>=0; j--){
                ans.add(ans.get(j));
            }
            for(int j=0;j<siz;j++){
                ans.set(j, "0"+ans.get(j));
            }
            for(int j=siz;j<2*siz;j++){
                ans.set(j, "1"+ans.get(j));
            }
        }

        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }

        scanner.close();
        return;
    }
    public static void main(String args[]){
        solve();
    }
}
