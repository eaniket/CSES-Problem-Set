import java.util.Scanner;

public class weirdAlgorithm {

    static void repeat(long n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        n = (n % 2 == 1) ? 3 * n + 1 : n / 2;
        repeat(n);
    }

    static void solve() {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        repeat(n);
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
