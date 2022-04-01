import java.util.*;

public class Q_12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = sc.nextInt();

        Boolean isPrime = true;

        for (int i=10; i<99; i++) {
            if (num%i==0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime) {
            System.out.println("Its Prime Number");
        }
        else {
            System.out.println("Its not a Prime Number");
        }
    }
}