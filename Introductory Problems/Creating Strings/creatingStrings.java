import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class creatingStrings {
    static List<String> ans = new ArrayList<>();

    static void helper(StringBuilder s, int idx, int n) {
        if (idx == n) {
            ans.add(s.toString());
            return;
        }
        Set<Character> st = new HashSet<>();
        for (int i = idx; i < n; i++) {
            if (st.contains(s.charAt(i))) continue;
            st.add(s.charAt(i));
            swap(s, idx, i);
            helper(s, idx + 1, n);
            swap(s, idx, i);
        }
    }

    static void swap(StringBuilder s, int i, int j) {
        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, temp);
    }

    static void solve() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = s.length();

        helper(new StringBuilder(s), 0, n);
        ans.sort(null);

        System.out.println(ans.size());
        for (String permutation : ans) {
            System.out.println(permutation);
        }
        scanner.close();
    }

    public static void main(String[] args) {
        long testCases = 1;
        while (testCases-- > 0) {
            solve();
        }
    }
}
