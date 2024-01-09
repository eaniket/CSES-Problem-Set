import java.util.Scanner;

public class permutations {

    private static void solve(){
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if (n == 1) {
            System.out.println(1);
            return;
        }
        if (n <= 3) {
            System.out.println("NO SOLUTION");
            return;
        }

        // Use StringBuilder for efficient string concatenation
        StringBuilder result = new StringBuilder();

        // Print even numbers
        for (int i = 2; i <= n; i += 2) {
            result.append(i).append(" ");
        }

        // Print odd numbers
        for (int i = 1; i <= n; i += 2) {
            result.append(i).append(" ");
        }

        // Print the final result
        System.out.println(result);
        return;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        // long testCases = scanner.nextLong();
        long testCases = 1;
        while(testCases-- > 0){
            solve();
        }
    }
}
