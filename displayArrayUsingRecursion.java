import java.util.*;
public class displayArrayUsingRecursion {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc  = new Scanner(System.in);
        //taking inputs
        // n --> size of array
        int n = sc.nextInt();
        // define array of size n
        int [] arr = new int[n];
        //taking inputs in array
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        //calling display Array function
        displayArr(arr,0);
    }

    public static void displayArr(int[] arr, int idx){
        //recursion break point
        if(idx==arr.length){
            return;
        }
        
        //printing element of array at index idx
        System.out.println(arr[idx]);
        //calling display array function with next index
        displayArr(arr,idx+1);
    }

}
