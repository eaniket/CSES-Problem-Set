import java.util.Scanner;

public class missingNumber {
    private static void solve() {
        long n, nSum = 0, sumNum = 0, temp;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextLong();
        nSum = n*(n+1)/2;
        while(n-- > 1){
            temp = scanner.nextLong();
            sumNum = sumNum + temp;
        }
        System.out.println(nSum-sumNum);
        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long testCases = 1;
        // long testCases = scanner.nextLong();
        while (testCases-- > 0) {
            solve();
        }
        scanner.close();
    }
}
