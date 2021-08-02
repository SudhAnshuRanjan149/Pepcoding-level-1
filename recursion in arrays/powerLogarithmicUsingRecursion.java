import java.util.*;
public class powerLogarithmicUsingRecursion {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        int ans = power(x,n);
        System.out.println(ans);
    }

    public static int power(int x, int n){
        if(n==1){
            return x;
        }
        int ans;
        if(n%2==0){
            int ans1 = power(x,n/2);
            ans = ans1 * ans1;
        }else{
            int ans1 = power(x,n/2);
            ans = x * ans1 * ans1;
        }
        
        return ans;
    }
}
