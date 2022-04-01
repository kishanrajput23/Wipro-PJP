import java.util.*;

public class Q_16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number you want to reverse : ");
        int n = sc.nextInt();
        int reverse = 0;

        while (n>0) {
            int rem = n%10;
            reverse = 10 * reverse + rem;
            n = n/10; 
        }

        System.out.println(reverse);
    }
}
