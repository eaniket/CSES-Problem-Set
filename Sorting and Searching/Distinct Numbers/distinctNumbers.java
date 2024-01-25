import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class distinctNumbers {
    private static void solve(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), temp;
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<n;i++){
            temp = scanner.nextInt();
            st.add(temp);
        }
        System.out.println(st.size());
        scanner.close();
        return;
    }
    public static void main(String args[]){
        solve();
    }    
}
