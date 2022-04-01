import java.util.*;

public class Q_1_b {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();

        System.out.println("Enter another number");
        int b = sc.nextInt();

        if (a==(b%10)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}