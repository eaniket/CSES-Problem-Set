import java.util.Scanner;

public class josephusProblem {
    private static void solve(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        Boolean[] eliminate = new Boolean[n]; 
        
        for(int i=1;i<=n;i++) {
            arr[i-1] = i;
            eliminate[i-1] = false;
        }

        int idx = 0;
        for(int i=0;i<n;i++){
            int cnt = 0;
            while(cnt < 2){
                if(eliminate[idx] == false){
                    cnt++;
                }
                if(cnt < 2){
                    idx = (idx+1)%n;
                }
            }
            eliminate[idx] = true;
            System.out.print(arr[idx] + " ");
        }
    }
    public static void main(String args[]){
        solve();
    }    
}
