import java.util.*;
public class towerOfHanoi {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        //taking input
        //n --> no of disk
        int n = sc.nextInt();
        //n1 --> tower one id
        int n1 = sc.nextInt();
        //n2 --> tower 2 id
        int n2 = sc.nextInt();
        //n3 --> tower 3 id
        int n3 = sc.nextInt();
        sc.close();
        //calling tower of hanoi function
        toh(n,n1,n2,n3);
        
    }

    public static void toh(int n, int t1, int t2, int t3){
        
        //recursion break point
        if(n==0){
            return;
        }
        
        //moving n-1 disks from tower 1 to tower 3 using tower 2
        toh(n-1,t1,t3,t2);
        //moving nth disk from tower 1 to tower 2
        System.out.println(n+"["+t1+" -> "+t2+"]");
        //moving n-1 disks from tower 3 to tower 2 using tower 1
        toh(n-1,t3,t2,t1);

    }
}
