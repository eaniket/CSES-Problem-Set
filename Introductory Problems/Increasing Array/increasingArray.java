import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class increasingArray {
    private static void solve(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n == 1){
            System.out.println("0");
            scanner.close();
            return;
        }
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scanner.nextInt());
        }
        long ans = 0, curr = arr.get(0);
        for(int i=1;i<n;i++){
            if(curr > arr.get(i)){
                ans = ans + (curr-arr.get(i));
            }
            curr = Math.max(curr, arr.get(i));
        }
        System.out.println(ans);
        scanner.close();
        return;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        long testCases = 1;
        // long testCases = scanner.nextLong();
        while (testCases-- > 0) {
            solve();
        }
        scanner.close();
    }
}
