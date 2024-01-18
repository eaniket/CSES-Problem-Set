import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class towerOfHanoi {
    static List<String> ans = new ArrayList();
    private static void move(int src, int dest){
        String temp = src + " " + dest;
        ans.add(temp);
    }
    private static void towerOfHanoiHelper(int n, int src, int dest, int helper){
        if(n == 1){
            move(src, dest);
            return;
        }
        towerOfHanoiHelper(n-1, src, helper, dest);
        move(src, dest);
        towerOfHanoiHelper(n-1, helper, dest, src);
    }
    private static void solve(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        towerOfHanoiHelper(n, 1, 3, 2);
        System.out.println(ans.size());
        for(int i = 0; i<ans.size(); i++){
            System.out.println(ans.get(i));
        }
        return;
    }
    public static void main(String args[]){
        solve();
    }
}
