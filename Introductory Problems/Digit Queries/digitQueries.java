import java.util.Scanner;

public class digitQueries {
    private static long pow10(int len){
        long num = 1;
        while(len-- > 0){
            num *= 10;
        }
        return num;
    }
    private static int solve(long k){
        int len = 1;
        while((9*len*pow10(len-1)) < k){
            k -= (9*len*pow10(len-1));
            len++;
        }
        long num = pow10(len-1) + (k/len);
        StringBuffer sb = new StringBuffer();
        while(num != 0){
            sb.append(num%10);
            num /= 10;
        }
        return (int)(sb.charAt(sb.length() - (int)(k%len)-1)-'0');
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k;
        while(n-- > 0){
            k = scanner.nextLong();
            if(k <= 9){
                System.out.println(k);
            }else{
                int ans = solve(k-1);
                System.out.println(ans);
            }
        }
        scanner.close();
        return;
    }    
}
