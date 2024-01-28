import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class movieFestival {
    private static void solve(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] timings = new int[n][2];
        for(int i=0;i<n;i++){
            timings[i][0] = scanner.nextInt();
            timings[i][1] = scanner.nextInt();
        }
        Arrays.sort(timings, new Comparator<int[]>() {
            public int compare(int[] a, int[] b){
                return Integer.compare(a[1], b[1]);
            }
        });
        int idx = 1, lastIdx = 0, ans = 1;
        while (idx < n) {
            if(timings[idx][0] >= timings[lastIdx][1]){
                ans++;
                lastIdx = idx;
            }
            idx++;
        }
        System.out.println(ans);
    }
    public static void main(String args[]){
        solve();
    }    
}
