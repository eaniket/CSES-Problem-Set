import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class concertTickets {
    private static void solve(){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, Integer> tixsCnt = new HashMap();
        TreeSet<Integer> tixs = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            tixs.add(temp);
            Integer cnt = tixsCnt.get((Integer)temp);
            cnt = (cnt == null) ? 0 : cnt+1;
            tixsCnt.put(temp, cnt); 
        }

        for (int i = 0; i < m; i++) {
            int temp = scanner.nextInt();
            // System.out.println(tixs);

            Integer pos = tixs.floor(temp);


            if (pos == null) {
                System.out.println("-1");
            } else {
                System.out.println(pos);
                Integer cnt = tixsCnt.get((Integer)pos);
                if(cnt == 0){
                    tixs.remove(pos);
                } else {
                    tixsCnt.put(pos, cnt-1);
                }
                
            }
        }
    }
    public static void main(String args[]){
        solve();
    }
}
