import java.util.Arrays;

public class Q_5 {
    public static void main(String args[]) {
        int[] arr = {45,12,56,78,942,78,564,12,5,3,646,7,4,94,75};

        Arrays.sort(arr);

        System.out.println("The 2 largest elements are " + arr[arr.length-1] + " and " + arr[arr.length-2]);
        System.out.println("The 2 smallest elements are " + arr[0] +  " and " + arr[1]);
    }
}
