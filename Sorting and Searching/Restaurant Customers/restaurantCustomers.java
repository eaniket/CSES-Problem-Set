import java.util.Arrays;
import java.util.Scanner;

public class restaurantCustomers {
    private static void solve(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int [] arrival = new int[n];
        int [] dept = new int[n];

        for(int i=0;i<n;i++){
            arrival[i] = scanner.nextInt();
            dept[i] = scanner.nextInt();
        }

        Arrays.sort(arrival);
        Arrays.sort(dept);

        int cnt = 0, ans = 0, aPtr = 0, dPtr = 0;
        while(aPtr < n && dPtr < n){
            if(arrival[aPtr] < dept[dPtr]){
                cnt++;
                aPtr++;
                ans = Math.max(ans, cnt);
            }else if(arrival[aPtr] > dept[dPtr]){
                cnt--;
                dPtr++;
            }else{
                aPtr++;
                dPtr++;
            }
        }
        System.out.println(ans);

    }
    public static void main(String args[]){
        solve();
    }     
}
