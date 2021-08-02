import java.util.*;
public class displayArrayReverseUsingRecursion {
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
        //calling display Array in reverse function
        displayArrReverse(arr,0);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        //recursion break point
        if(idx==arr.length){
            return;
        }
        
        //calling display array in reverse function with next index
        displayArrReverse(arr,idx+1);
        //printing element of array at index idx
        System.out.println(arr[idx]);
    }
}
