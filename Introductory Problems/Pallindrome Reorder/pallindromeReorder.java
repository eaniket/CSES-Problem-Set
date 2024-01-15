import java.util.Scanner;

public class pallindromeReorder {
    private static void solve(){
        Scanner scanner = new Scanner(System.in);
        StringBuffer s = new StringBuffer();
        s.append(scanner.nextLine());

        int[] cnt = new int[26];
        int n = s.length(), fl = 0, p=0;
        for(int i=0;i<n;i++){
            cnt[s.charAt(i)-'A'] += 1; 
            if(cnt[s.charAt(i)-'A']%2 == 0)
                fl--;
            else fl++;
        }
        if(fl > 1){
            System.out.println("NO SOLUTION");
            return;
        }
        for(int i=0; i<26; i++){
            while(cnt[i] != 0){
                if(cnt[i] == 1){
                    s.setCharAt(n/2, (char)('A'+i));
                    cnt[i]--;
                }else{
                    s.setCharAt(p, (char)('A'+i));
                    s.setCharAt(n-p-1, (char)('A'+i));
                    cnt[i] -= 2;
                    p++;
                }
            }
        }
        System.out.println(s);
        return;
    }
    public static void main(String args[]){
        solve();
    }    
}
