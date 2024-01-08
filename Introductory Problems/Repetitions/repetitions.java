import java.util.Scanner;

public class repetitions{
    private static void solve(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = s.length(), l = 0, r = 0, temp = 0;
        while(r<n){
            while(r<n && s.charAt(l) == s.charAt(r))
                r++;
            temp = Math.max(temp, r-l);
            l = r;
        }
        System.out.println(Math.max(temp, r-l));
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
