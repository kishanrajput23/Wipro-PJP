import java.util.Arrays;

public class Q_6 {
    public static void main(String args[]) {
        int[] arr = {45,12,56,87,942,78,564,22,5,3,646,7,4,94,75};

        Arrays.sort(arr);

        System.out.print("The sorted array is : ");

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
