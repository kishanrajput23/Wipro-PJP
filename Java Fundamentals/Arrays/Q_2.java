import java.util.*;
import java.util.Arrays;

public class Q_2 {
    
    public static void main(String args[]) {
        int[] arr = {45,12,56,78,942,78,564,12,5,3,646,7,4,94,75};

        Arrays.sort(arr);

        System.out.println("The minimum element of this array is " + arr[0]);
        System.out.println("The maximum element of this array is " + arr[arr.length-1]);
    }

    
}
