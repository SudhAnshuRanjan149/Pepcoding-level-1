import java.util.Scanner;

public class firstIndex {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc  = new Scanner(System.in);
        
        //taking inputs
        // n --> size of array
        int n = sc.nextInt();
        
        // define array of size n
        int [] arr = new int[n];
        
        //taking inputs in array
        for (int i = 0; i < arr.length; i++) {
          arr[i] = sc.nextInt();
        }
        int x =sc.nextInt();
        sc.close();
        
        //calling First Index function
        int ans = firstIndex(arr,0,x);
        
        //print result
        System.out.println(ans);
      }
    
      public static int firstIndex(int[] arr, int idx, int x) {
        //recursion break point
        
        if(idx == arr.length){
            return -1;
        }
        
        // finding first Index of X from index idx+1 to last
        int firstIdx = firstIndex(arr,idx+1,x);
        
        // checking if X also present at index idx
        if(arr[idx]==x){
            firstIdx = idx;
        }
        
        //return result
        return firstIdx;
      }
    
}
