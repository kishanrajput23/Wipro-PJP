import java.util.*;

public class Q_3 {
    public static void main(String args[]) {
        int[] arr = {45,12,56,78,942,78,564,12,5,3,646,7,4,94,75};
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number which you want to find in an array : ");
        int num = sc.nextInt();
        Boolean flag = false;
        int count = 0;
        for (int i=0; i<arr.length; i++) {
            if (num == arr[i]) {
                flag = true;
                count += i;
                break;
            }
        }

        if (flag) {
            System.out.println(count);
        }
        else {
            System.out.println(-1);
        }
    }
}
