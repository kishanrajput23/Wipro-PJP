import java.util.*;

public class Q_17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number you want to check for palindome : ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        while (n>0) {
            int rem = n%10;
            sum = 10 * sum + rem;
            n = n/10; 
        }
        if (temp==sum) {
            System.out.println("Its Palindrome");
        }
        else {
            System.out.println("Its not a Palindrome");
        }
    }
}
