import java.util.*;

public class maxOfAnArrayUsingRecursion {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        // taking inputs
        // n --> size of array
        int n = sc.nextInt();
        // define array of size n
        int[] arr = new int[n];
        // taking inputs in array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        // calling Max of Array function
        int max = maxOfArray(arr, 0);
        // printing result
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx) {
        // recursion break point
        if (idx == arr.length) {
            return arr[idx - 1];
        }

        // finding maximum from index idx+1 to last
        int max = maxOfArray(arr, idx + 1);
        // compare the result of max with element at index idx
        if (max < arr[idx]) {
            max = arr[idx];
        }

        return max;
    }
}
