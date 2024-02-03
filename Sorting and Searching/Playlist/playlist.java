import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class playlist {
    private static void solve(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int l=0, r=0, ans=0;
        Map<Integer, Integer> mp = new HashMap<>();
        while(r<n){
            if(mp.containsKey(arr[r]) == true){
                l = Math.max(l, mp.get(arr[r])+1);
            }
            mp.put(arr[r], r);
            ans = Math.max(ans, r-l+1);
            r++;
        }
        System.out.println(ans);

    }
    public static void main(String args[]){
        solve();
    }    
}
