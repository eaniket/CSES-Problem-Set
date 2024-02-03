import java.util.Scanner;

public class maximumSubarraySum {
    private static void solve(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long meh = 0, msf = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            meh += scanner.nextInt();
            msf = Math.max(msf, meh);
            if(meh < 0)
                meh = 0;
        }
        System.out.println(msf);
    }
    public static void main(String args[]){
        solve();
    }    
}
