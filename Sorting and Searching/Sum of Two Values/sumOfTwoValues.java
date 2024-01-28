import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sumOfTwoValues {
    private static void solve(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();

        int [][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = scanner.nextInt();
            arr[i][1] = i+1;
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b){
                return Integer.compare(a[0], b[0]);
            }
        });

        int l = 0, r = n-1;
        while(l<r){
            if(arr[l][0] + arr[r][0] == x){
                System.out.println(arr[l][1] +" "+ arr[r][1]);
                return;
            }else if(arr[l][0] + arr[r][0] > x){
                r--;
            }else{
                l++;
            }
        }
        System.out.println("IMPOSSIBLE");
        return;
    }
    public static void main(String args[]){
        solve();
    }    
}
