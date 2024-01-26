import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ferrisWheel {
    private static final int FAST_IO_BUFFER = 1 << 16;

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();

        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] weights = new int[n];

        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        Arrays.sort(weights);

        int left = 0, right = n - 1, ans = 0;

        while (left < right) {
            ans++;
            if (weights[left] + weights[right] <= x) {
                left++;
            }
            right--;
        }

        if (left == right) {
            ans++;
        }

        System.out.println(ans);
    }

    static class FastScanner {
        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        public FastScanner() {
            reader = new BufferedReader(new InputStreamReader(System.in), FAST_IO_BUFFER);
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
